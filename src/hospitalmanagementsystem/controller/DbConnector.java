/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DbConnector {
    Connection conn = null;
    
    public static Connection connectDb(){
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root" , "");
            return connection;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return null;
    }
}
