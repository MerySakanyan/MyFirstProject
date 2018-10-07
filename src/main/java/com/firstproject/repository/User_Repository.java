package com.firstproject.repository;

import com.firstproject.connector.MyConnector;
import com.firstproject.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User_Repository {



//for session
    public void testUser() {

        try (Connection connection = MyConnector.getInstance()) {
                 connection.setAutoCommit(false);// avtomat commit chi anum   ete sxal unenq  voch mek chi ashxati
        //    connection.setReadOnly(true); toxnum em miayn select anel
            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);// kardal patahakan em @ntrel



            PreparedStatement preparedStatement = connection.prepareStatement("Insert INTO user Values(0,'hjh','cv','bfg','sgs')");
            preparedStatement.executeUpdate();
        PreparedStatement  preparedStatement1 = connection.prepareStatement("Insert INTO user Values('h','536','cv','bfg','sgs')");
        //sxal
        preparedStatement1.executeUpdate();
       PreparedStatement    preparedStatement2 = connection.prepareStatement("Insert INTO user Values(0,'5','cv','bfg','sgs')");



            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();




            connection.commit();

            //connection.rollback();    delete e anum  verevi insertner@


        } catch (SQLException e) {

            e.printStackTrace();
        }

    }







    public void setUser(User user) {

        try (Connection connection = MyConnector.getInstance()) {
      //      connection.setAutoCommit(false);



            PreparedStatement preparedStatement = connection.prepareStatement("Insert INTO user Values(0,?,?,?,?)");
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setString(4, user.getSurname());
            preparedStatement.executeUpdate();


            preparedStatement = connection.prepareStatement(("SELECT max(id) from user "));
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                user.setId(rs.getInt(1));
            }
            preparedStatement.execute();

            //connection.commit();

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public User getByEmailAndPassword(String email,String password) {

        User user = null;

        try (Connection connection = MyConnector.getInstance()) {


            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user where email = ? and password = ?");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                user = new User();

                user.setId(resultSet.getInt(1));
                user.setEmail(resultSet.getString(2));
                user.setName(resultSet.getString(4));
                user.setSurname(resultSet.getString(5));
                user.setPassword(resultSet.getString(3));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }




    public void myUpdate(User user){


        try (Connection conection = MyConnector.getInstance()) {

            PreparedStatement preparedStatement = conection.prepareStatement("UPDATE user SET password = ? WHERE id = ?");
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setInt(2,user.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public User getName(int id) {

        User user = null;

        try (Connection connection = MyConnector.getInstance()) {


            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user where id = ? ");
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                user = new User();

                user.setId(resultSet.getInt(1));
                user.setEmail(resultSet.getString(2));
                user.setName(resultSet.getString(4));
                user.setSurname(resultSet.getString(5));
                user.setPassword(resultSet.getString(3));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }



}
