<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp app</title>
</head>
<body>
<%@ page import ="java.util.Date" %>
<%! int age =90; %>
<%

Date date = new Date();

String name = request.getParameter("uname");
String city = request.getParameter("ucity");
String age = request.getParameter("uage");
String email = request.getParameter("uemail");
String pass = request.getParameter("upass");

out.println(age);

%>
<h1><%= date %></h1>

<h1 > He is from  <%= city %> </h1>
</body>
</html>