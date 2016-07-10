<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign-Up Form</title>
</head>
<body>

	CAT
	<mvc:form modelAttribute="user" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="name">Name:</mvc:label></td>
				<td><mvc:input path="name" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
				
			</tr>
		</table>
	</mvc:form>

</body>
</html>