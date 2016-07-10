package com.kcomp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloReaderController {

	@RequestMapping(value = "/hello")
	public ModelAndView sayHello(){
		ModelAndView mv = new ModelAndView("signin","user",new User());
		mv.setViewName("signup");
		return mv;
	}
	
	@RequestMapping(value = "/result")
	public ModelAndView result(User user){
		ModelAndView mv = new ModelAndView();
		
		if(!isNameValid(user.getName())){
			mv.setViewName("signup");
			return mv;
		}
		
		mv.setViewName("result");
		mv.addObject("u",user);
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public void test(User user){
		//System.out.println("IN TEST!");
	}
	
	private boolean isNameValid(String name){
		
		return name.trim().equals(name);
		
	}
	
}
