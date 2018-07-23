/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */

    
public class AdminController {

    private static Connection conn;

    /**
     *
     * @param employee
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static ResultSet getAdmin(Employee employee) throws ClassNotFoundException,SQLException{
        
        conn =DbConnector.connectDb();
        String q = "SELECT  UserName, password,emp_occupation FROM employee_username WHERE UserName='"+employee.getEmp_username()+"' AND password='"+employee.getEmp_password()+"'";
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        return result;
        }
    
}
