<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>
.maa
{
width:600px;
height:400px;
box-shadow:10px 10px 10px white;
text-shadow:2px 2px 2px red;
 color: white;
background-color:lightgrey;

border-radius:10px;


}
h1{
color:white;
}
</style>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body bgcolor="pink">
<center>
<div class="maa" align="center">
<h1> <marquee>Registration successful</marquee></h1>
<%
String str=(String)session.getAttribute("name");


%>
 <h1> Hey <%=str %> u r registered successfully</h1>


</div>
</center>
<center>
<a href="Login.html"  target=_blank  style="color:blue;"> <h2> Click to login</h2></a>
</center>


</body>
</html>