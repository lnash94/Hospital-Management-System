/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.Employee;
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
public class EmployeeController {
    private static Connection conn;
    public static int addEmployee(Employee employee) throws ClassNotFoundException,SQLException{
               
        conn = DbConnector.connectDb();
       
        String q2 = "INSERT INTO employee_username( UserName, password, emp_name, emp_gender, emp_contact, emp_address, emp_email, emp_occupation,emp_nic,emp_dob,emp_joindate) VALUES ('"+employee.getEmp_username()+"','"+employee.getEmp_password()+"','"+employee.getEmp_name()+"','"+employee.getEmp_gender()+"','"+employee.getEmp_contact()+"','"+employee.getEmp_address()+"','"+employee.getEmp_email()+"','"+employee.getEmp_ocuppation()+"','"+employee.getEmp_nic()+"','"+employee.getEmp_dob()+"','"+employee.getEmp_joineddate()+"')";
        Statement st2 = conn.createStatement();
        
            
  
        int executeUpdate = st2.executeUpdate(q2);
        
    return executeUpdate;
    }
    //check for employee username already exite.
    public static ResultSet getEmployee(Employee employee) throws ClassNotFoundException,SQLException{
        conn =DbConnector.connectDb();
        String q = "SELECT  UserName  FROM employee_username WHERE UserName='"+employee.getEmp_username()+"'";
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        return result;
        
        
    }
    //get details acording to the employee id.
    public static ResultSet getEmployeedetails(Employee employee) throws ClassNotFoundException,SQLException{
        conn =DbConnector.connectDb();
        String q = "SELECT  *  FROM employee_username WHERE emp_id ='"+employee.getEmp_id()+"'";
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        return result;
        
        
    }
}
