package com.firstproject.repository;

import com.firstproject.connector.MyConnector;
import com.firstproject.model.Book;
import com.firstproject.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book_Repository {
    public void setBook(Book book) {

        try (Connection connection = MyConnector.getInstance()) {

            PreparedStatement preparedStatement = connection.prepareStatement("Insert INTO book Values(0,?,?,?,?)");
            preparedStatement.setString(1, book.getUserid());
            preparedStatement.setString(2, book.getName());
            preparedStatement.setString(3, book.getTitle());
            preparedStatement.setString(4, book.getPrice());


            preparedStatement.executeUpdate();


            preparedStatement = connection.prepareStatement(("SELECT max(id) from book "));
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                book.setId(rs.getInt(1));
            }
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Book getUserId(String name) {

        Book book=null;

        try (Connection connection = MyConnector.getInstance()) {


            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM book where name = ? ");
            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                book=new Book();

                book.setId(resultSet.getInt(1));
                book.setUserid(resultSet.getString(2));
                book.setName(resultSet.getString(3));
                book.setTitle(resultSet.getString(4));



            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return book;
    }


}
