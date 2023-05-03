package org.example;


import org.example.LAB9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class LAB12 {
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "0969422653";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement= connection.createStatement();
            String sql ="insert into student(studentId,fristName,lastName,email,deptId)" + "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "1111");
            preparedStatement.setString(2, "Jack");
            preparedStatement.setString(3, "Ryan");
            preparedStatement.setString(4, "jack.rya@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}