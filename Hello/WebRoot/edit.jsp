<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--This is the Edit Page.-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
	<s:if test="book==null">
	Create Book
	</s:if>
	<s:else>
	Update Book
	</s:else>
	</h2>
	<s:form action="store" align="center">
	<s:textfield name="book.ISBN" label="ISBN"></s:textfield>
	<s:textfield name="book.Title" label="Title"></s:textfield>
	<s:textfield name="book.Publisher" label="Publisher"></s:textfield>
	<s:textfield name="book.PublishDate" label="PublishDate"></s:textfield>
	<s:textfield name="book.Price" label="Price"></s:textfield>
	<s:textfield name="authorinfo.Name" label="AuthorName"></s:textfield>
	<s:textfield name="authorinfo.Age" label="AuthorAge"></s:textfield>
	<s:textfield name="authorinfo.Country" label="AuthorCountry"></s:textfield>
	<s:textfield name="authorinfo.AuthorID" label="AuthorID"></s:textfield>
	<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>
