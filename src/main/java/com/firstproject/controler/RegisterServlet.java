package com.firstproject.controler;

import com.firstproject.model.User;
import com.firstproject.repository.User_Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmpassword = req.getParameter("confirmpassword");
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        if (password.equals(confirmpassword)) {
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            user.setName(name);
            user.setSurname(surname);


            User_Repository user_repository = new User_Repository();
            user_repository.setUser(user);
            response.sendRedirect("index.jsp");
        } else {
            System.out.println(req.getRequestURL().toString());
            req.setAttribute("errMess", "Repeat password");
            response.sendRedirect("/Pages/register.jsp");
        }


    }


}
