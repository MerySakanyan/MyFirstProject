
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HomePage</title>
    <link rel="stylesheet" href="./style.css">
</head>
<body background="abs.jpg">
<div style="width: 500px;
                         height: 600px;
 background-color: #ffffff5c;
margin: 0 auto;
margin-top: 2%;
                         ">
<form method="post" action="/register"
      class="main" >
    <img src="cba.png" style="width: 200px;height: 200px;margin-left: 150px;">
    <input placeholder="email" type="text" name="email" style='
    margin-left: 150px;
    width: 200px;
    height: 28px;
    border-radius: 50px;
    border: none;
    outline: 0;
    margin-top: 10px;
    padding-left: 10px;'>
    <br>
    <br>
   <input type="password" name="password"placeholder="password" maxlength="12" style="margin-left: 150px;
    width: 200px;
    height: 28px;
    border-radius: 50px;
    border: none;
    outline: 0;
    margin-top: 10px;
    padding-left: 10px;">
    <br>
    <br>
    <input type="password" name="confirmpassword"placeholder="confirm password" maxlength="12" style="margin-left: 150px;
    width: 200px;
    height: 28px;
    border-radius: 50px;
    border: none;
    outline: 0;
    margin-top: 10px;
    padding-left: 10px;">
    <br>
    <br>
   <input type="text" name="name" placeholder="name" style="margin-left: 150px;
    width: 200px;
    height: 28px;
    border-radius: 50px;
    border: none;
    outline: 0;
    margin-top: 10px;
    padding-left: 10px;">
    <br>
    <br>
    <input type="text" name="surname" placeholder="Surname"  style=" margin-left: 150px;
    width: 200px;
    height: 28px;
    border-radius: 50px;
    border: none;
    outline: 0;
    margin-top: 10px;
    padding-left: 10px;">
    <br>
    <br>

    <input type="submit" value="Sign in" style="width: 200px;height: 28px;border-radius: 50px;
margin-left: 150px;background-color: pink;border: none;cursor: pointer;box-shadow:0px 2px 11px #383636;">
</form>
    <br>
    <br>
    <br>
    <%if(request.getAttribute("errMess")!=""&& request.getAttribute("errMess")!=null){%>
    <span style="color: red; margin-left: 158px" >
  <%=request.getAttribute("errMess")%>
  </span>
    <%}
    %>
</div>
</body>
</html>
