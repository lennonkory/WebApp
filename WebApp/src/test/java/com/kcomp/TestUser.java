package com.kcomp;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
public class TestUser extends BaseControllerTests {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void formSubmittedSuccessfully() throws Exception {
        this.mockMvc.perform(
                post("/result")
                        .param("name", "Bob"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(view().name("result"))
                .andExpect(model().hasNoErrors())
                .andExpect(model().attribute("u", hasProperty("name", is("Bob"))))
                ;
    }
	
    @Test
    public void formSubmittedWrong() throws Exception {
        this.mockMvc.perform(
                post("/result")
                        .param("name", "Kory "))
                .andExpect(status().isOk())
                .andExpect(view().name("signup"))
                //.andExpect(model().hasErrors());
                ;
    }
    
    @Test
    public void testTest()throws Exception{
    	this.mockMvc.perform(
    			post("/test"))
    			.andDo(print());
    }
    
}
