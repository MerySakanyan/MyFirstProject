<%--
  Created by IntelliJ IDEA.
  User: Mery
  Date: 7/22/2018
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyFirstProject</title>
    <meta charset="utf-8">
</head>
<body  background="image/abs.jpg">
<div style="width: 500px;
height: 600px;
 background-color: #ffffff5c;
margin: 0 auto;
margin-top: 2%;
">
<form method="post" action="/login"
      class="main" >
    <img src="image/cba.png" style="width: 150px;height: 150px;margin-left: 180px;">


    <input type="text" name="email" placeholder="email" style="    margin-left: 150px;
    width: 200px;
    height: 28px;
    border-radius: 50px;
    border: none;
    outline: 0;
    margin-top: 10px;
    padding-left: 10px;"> <br><br>
    <input type="password" name="password" placeholder="password" maxlength="12" style="margin-left: 150px;width: 200px;
    height: 28px;border-radius: 50px;boredr:none;outline: none;padding-left: 10px;">
    <br>
    <br>


    <input type="submit" value="Login"
           style="
           width: 200px;
    height: 28px;
    border-radius: 50px;
    opacity: 1;
    margin-left: 150px;
    background-color: #006b00;
    border: 0;
    box-shadow: 0px 2px 9px;
    cursor: pointer">



</form>
<br>

<button  onclick="location.href='/Pages/register.jsp'" id="register" style="width: 200px;height: 28px;border-radius: 50px;
margin-left: 150px;background-color: pink;border: none;cursor: pointer;box-shadow:0px 2px 11px #383636;">Sign in</button>

<br>
<br>
<br>
    <%if(request.getAttribute("errMessage")!=""&& request.getAttribute("errMessage")!=null){%>
    <span style="color: red; margin-left: 158px" >
  <%=request.getAttribute("errMessage")%>
  </span>
    <%}
    %>
</div>
</body>
</html>
