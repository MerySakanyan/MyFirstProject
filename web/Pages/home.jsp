<%@ page import="com.firstproject.model.User" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body background="abs.jpg">

<% User user = (User) request.getSession().getAttribute("user"); %>
<% User user1 = (User) request.getSession().getAttribute("user1"); %>

<H1 style="color: silver;margin-left: 520px">WELCOME DEAR</H1>
<p style="background-color: darkgrey; width: 120px; height: 50px;
border-radius: 10px;size: 50px; color: darkslategrey; margin-left: 500px">Name: <%= user.getName()%>
</p>
<p style="background-color: darkgrey; width: 120px; height: 50px;
 border-radius: 10px;size: 50px; color:darkslategrey; margin-left: 700px; margin-top: -65px">Surname: <%= user.getSurname()%>
</p>


<form method="post" action="/search"
      class="main" style="width: 200px;
                         height: 150px;
                            opacity: 0.7;
                         background-color: white;
                         margin-left: 900px;
                         margin-top: -100px; ">


    <br>
    <br>
    <input type="search" name="search" placeholder="book name" style="
    margin-left: 20px;


    width: 150px;height: 28px;border-radius: 50px"> <br><br>


    <input type="submit" value="search" style="width: 100px;height: 28px;border-radius: 50px; opacity:1;
						 margin-left: 20px;background-color: green">

    <p style=" margin-left: 20px;">
        Name: <%if (user1 != null) {%>
        <span>
  <%=user1.getName()%>
  </span>
        <%
            }
        %>
    </p>


    </p>
</form>


<form method="post" action="/changepassword"
      class="main" style="width: 500px;
                         height: 400px;
                         opacity: 0.5 ;
                         background-color: white;
                         margin-left: 100px;
                         margin-top: 60px; ">

<br>
<br>
    <input type="password" name="oldpassword" placeholder="old password"
           style="margin-left: 150px;width: 200px;height: 28px;border-radius: 50px"> <br><br>
    <input type="password" name="password" placeholder="new password" maxlength="12" style="margin-left: 150px;width: 200px;
    height: 28px;border-radius: 50px">
    <br>
    <br>


    <input type="submit" value="change password" style="width: 200px;height: 28px;border-radius: 50px; opacity:1;
						 margin-left: 150px;background-color: green">
</form>
<form method="post" action="/addbook"
      class="main" style="width: 500px;
                         height: 400px;
                         opacity: 0.5 ;
                         background-color: white;
                         margin-left: 800px;
                         margin-top: -400px; ">

    <br>
    <br>
    <input type="text" name="name" placeholder="name" maxlength="12" style="margin-left: 150px;width: 200px;
    height: 28px;border-radius: 50px">
    <br>
    <br>
    <input type="text" name="title" placeholder="title"
           style="margin-left: 150px;width: 200px;height: 28px;border-radius: 50px"> <br><br>

    <input type="text" name="price" placeholder="price" maxlength="12" style="margin-left: 150px;width: 200px;
    height: 28px;border-radius: 50px">
    <br>
    <br>

    <input type="submit" value="Add Book" style="width: 200px;height: 28px;border-radius: 50px; opacity:1;
						 margin-left: 150px;background-color: green">
</form>
</body>
</html>
