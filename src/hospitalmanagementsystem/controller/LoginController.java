/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.LoginUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author PC
 */
public class LoginController {

    private static Connection conn;
    public static ResultSet getUser(LoginUser user) throws ClassNotFoundException,SQLException{
        /*try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection connection;*/
        conn = DbConnector.connectDb();
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root" , "");
        String s3 ="SELECT  emp_id, emp_name FROM employee_username WHERE UserName='"+user.getUsername()+"' AND  password ='"+user.getPassword()+"'";
        Statement st3 = conn.createStatement();
        
        
        ResultSet result = st3.executeQuery(s3);
       
        
        
        
    return result;
        
    }
    
    //public static int getEmployee(Employee employee) throws ClassNotFoundException,S
}
