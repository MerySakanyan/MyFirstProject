package com.firstproject.controler;

import com.firstproject.model.User;
import com.firstproject.repository.User_Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        String password = request.getParameter("password");
        String oldpassword = request.getParameter("oldpassword");
        if (!password.equals(oldpassword)) {

            user.setPassword(password);
            user.setId(user.getId());


            User_Repository user_repository = new User_Repository();
            user_repository.myUpdate(user);
            response.sendRedirect("/Pages/home.jsp");

        } else {
            response.sendRedirect("index.jsp");
        }


    }


}
