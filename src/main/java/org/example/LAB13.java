package org.example;


import org.example.LAB9;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB13 {
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "0969422653";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement= connection.createStatement();
            String sql = "update student set email = ? where studentID = ?" ;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "niraphan2560@gmailcom");
            preparedStatement.setString(2, "111111");
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}