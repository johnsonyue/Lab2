<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detail</title>
<style>
	 table {
            border: 1px solid black;
            border-collapse: collapse;
        }
        
        table thead tr td{
            border: 1px solid black;
            padding: 3px;
            background-color: #cccccc;
        }
        
        table tbody tr td {
            border: 1px solid black;
            padding: 3px;
        }

</style>
</head>
<body>
<table border="1">
		<thead>
	 	<tr>
	 	<td>ISBN</td>
	 	<td>Title</td>
	 	<td>AuthorID</td>
	 	<td>Publisher</td>
	 	<td>PublishDate</td>
	 	<td>Price</td>
	 	<td>AuthorName</td>
	 	<td>AuthorAge</td>
	 	<td>AuthorCountry</td>
	 	</tr>
	 	</thead>
	 	
	 	<tbody>
	 	<tr>
	 		<td><s:property value="book.ISBN"/></td>
	 		<td><s:property value="book.Title"/></td>
	 		<td><s:property value="book.AuthorID"/></td>
	 		<td><s:property value="book.Publisher"/></td>
	 		<td><s:property value="book.PublishDate"/></td>
	 		<td><s:property value="book.Price"/></td>
	 		<td><s:property value="authorinfo.Name"/></td>
	 		<td><s:property value="authorinfo.Age"/></td>
	 		<td><s:property value="authorinfo.Country"/></td>
	 	</tr>
	 	</tbody>
	 	
	</table>
</body>
</html>