/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.questionairv1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sony
 */
public class ConnectionFactory {
    private static final String USERNAME = "palanca";
    private static final String PASSWORD = "palanca2019";
    private static final String URL = "jdbc:mysql://localhost:3306/questionnairsoft?serverTimezone=UTC";
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
      
        return connection;
    }
}
