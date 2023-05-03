package org.example;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB14 {

        public static void main(String[] args) {
            String URL ="jdbc:mysql://localhost:3306/mydb1";
            String username = "root";
            String password = "0969422653";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(URL, username, password);
                    DatabaseMetaData dbMetaData= connection.getMetaData();
            System.out.println("database URL: " + dbMetaData.getURL());
            System.out.println("database product name: " + dbMetaData.getDatabaseProductName());
            System.out.println("database product version: " + dbMetaData.getDatabaseProductVersion());
             System.out.println("JDBC driver name: " + dbMetaData.getDriverName());
             System.out.println("JDBC driver version: " + dbMetaData.getDriverVersion());
             System.out.println("JDBC driver major version: " + dbMetaData.getDriverMajorVersion());
             System.out.println("JDBC driver minor version: " + dbMetaData.getDriverMinorVersion());
             System.out.println("Max number of connections: " + dbMetaData.getMaxConnections());
             System.out.println("MaxTableNameLength: " + dbMetaData.getMaxTableNameLength());
             System.out.println("MaxColumnsInTable: " + dbMetaData.getMaxColumnsInTable());
            connection.close();

                ResultSet resultSet = dbMetaData.getTypeInfo();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}



