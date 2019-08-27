<%@page import="java.sql.ResultSet"%>
<%@page import="com.org.model.DaoClass"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<style>

</style>
</head>
<body>
<%
  ResultSet rs=(ResultSet)request.getAttribute("Result");
%>
<table>
<tr>
<td>Heading</td>
<td>Content</td>
</tr>
<%while(rs.next()) {%>
<tr>
<td><%out.print(rs.getString(1));%></td>
<td><% out.print(rs.getString(2)); %></td>
</tr>
<%} %>
</table>
</body>
</html>