<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome Mr admin
<fieldset>
    
    <legend>Add Faculty</legend>
<form action="Databaseread" method="post"> <!-- addservlet here -->
		Name:<input name="FName" type="text"><br>
		<input type="submit" value="Submit">
		
	</form>
	</fieldset>
<!-- 	<legend>Add Admin</legend> -->
<!-- 	<form action="addadmin" method="post"> addservlet here -->
<!-- 		Name:<input name="FName" type="text"><br> -->
<!-- 		<input type="submit" value="Submit"> -->
<!-- 	</form> -->
<!-- 	<legend>Add Associate</legend> -->
<!-- 	<form action="addassociate" method="post"> addservlet here -->
<!-- 		Name:<input name="FName" type="text"><br> -->
<!-- 		<input type="submit" value="Submit"> -->
<!-- 	</form> -->
	
</body>
</html>