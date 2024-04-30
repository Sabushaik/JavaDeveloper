<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<Style>
.man
{ width:400px;
  height:500px;
  box-shadow:10px 10px 10px white;
  text-shadow:2px 2px 2px red;
  align-content:center;
  background-color:cyan;
  border-radius:20px;
  

}
</Style>
</head>
<body bgcolor="purple">
<center>
<div class="man">
<h1> Successful login</h1>
<%
String str=(String)session.getAttribute("name");%>
 <h1> Hey <%=str %> u r registered successfully</h1>

</div>
</center>


</body>
</html>