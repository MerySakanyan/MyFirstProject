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
import java.io.IOException;

@WebServlet(name = "SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String  bookname=request.getParameter("search");

        Book_Repository repository=new Book_Repository();
        Book book=repository.getUserId(bookname);


        User_Repository user_repository=new User_Repository();
        User user=user_repository.getName(Integer.parseInt(book.getUserid()) );

        if (book==null){
            //        request.setAttribute("errMessage", "wrong email or password");
//
            //       request.getRequestDispatcher("/index.jsp").forward(request,response);
            response.sendRedirect("index.jsp");
        }else {
            request.getSession().setAttribute("user1",user);
            response.sendRedirect("/Pages/home.jsp");


        }
         }


}
