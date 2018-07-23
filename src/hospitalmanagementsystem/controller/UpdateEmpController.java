/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root" , "");

/**
 *
 * @author PC
 */
public class UpdateEmpController {
    
    private static Connection conn;
    
    public static int updateEmployee(Employee employee) throws ClassNotFoundException,SQLException{
      
        conn = DbConnector.connectDb();
       
        String q4 ="UPDATE employee_username SET emp_name='"+employee.getEmp_name()+"',emp_contact='"+employee.getEmp_contact()+"',emp_address='"+employee.getEmp_address()+"' WHERE emp_id='"+employee.getEmp_id()+"'";
        Statement st4 = conn.createStatement();
        
            
  
        int executeUpdate = st4.executeUpdate(q4);
        
    return executeUpdate;

        
                
    }
    public static int updateEmployeepassword(Employee employee) throws ClassNotFoundException,SQLException{
      
        conn = DbConnector.connectDb();
       
        String q4 ="UPDATE employee_username SET emp_password='"+employee.getEmp_password()+"' WHERE emp_id='"+employee.getEmp_id()+"'";
        Statement st4 = conn.createStatement();
        
        int executeUpdate = st4.executeUpdate(q4);
        
    return executeUpdate;

        
                
    }
}
