<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Result  ${author}</title>
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
<body align="center">
	<table border="1">
		<thead>
	 	<tr>
	 	<td>ISBN</td>
	 	<td>Title</td>
	 	<td>Operation 1</td>
	 	<td>Operation 2</td>
	 	</tr>
	 	</thead>
	 	
	 	<tbody>
	 	<s:iterator value="books">
	 		<tr>
	 			<td><s:property value="ISBN"/></td>
	 			<td>
	 				<a href='<s:url action="detail"><s:param name="ISBN" value="ISBN"/></s:url>'>
	 					<s:property value="Title"/>
	 				</a>
	 			</td>
	 			<td>
	 				<a href='<s:url action="delete">
	 				<s:param name="ISBN" value="ISBN" />
	 				</s:url>'>
                                delete
                    </a>
	 			</td>
	 			<td>
	 				<a href='<s:url action="edit">
	 				<s:param name="ISBN" value="ISBN" />
	 				</s:url>'>
                                update
                    </a>
	 			</td>
	 		</tr>
	 	</s:iterator>
	 	</tbody>
	 	
	</table>
	
</body>
</html>