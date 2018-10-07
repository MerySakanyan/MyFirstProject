package com.firstproject.controler;

import com.firstproject.model.Book;
import com.firstproject.model.User;
import com.firstproject.repository.Book_Repository;
import com.firstproject.repository.User_Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AddBookServlet")
public class AddBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        String name=request.getParameter("name");
        String title=request.getParameter("title");
        String price=request.getParameter("price");

        Book book=new Book();
        book.setUserid(String.valueOf(user.getId()));
        book.setName(name);
        book.setTitle(title);
        book.setPrice(price);

        Book_Repository repository=new Book_Repository();
        repository.setBook(book);

        response.sendRedirect("index.jsp");

    }


}
