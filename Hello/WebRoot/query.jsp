<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--This is the Query Page.-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	a{color:blue;}
</style>
<title>BookQuery</title>
</head>
<body align="center">
<form action="result">
	<table align="center">
	<caption align="top" ><h2>BookQuery</h2></caption>
	<tr align="center">
		<td><input type="text" name="author" align="middle" style="width: 397px"/></td>
	</tr>
	<tr align="center">
		<td><input type="submit" value="submit" align="middle"></td>
	</tr>
	<tr align="center">
		<td><a href="edit.jsp">create new book</a></td>
	</tr>
	</table>
</form>

</body>
</html>
