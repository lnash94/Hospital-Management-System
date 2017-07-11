/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.Doctor;
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
public class DoctorController {
    public static  int addDoctor(Doctor doctor)throws ClassNotFoundException,SQLException{
         try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection connection;
        connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root" , "");
        String q2 = "INSERT INTO doctor(emp_id, specialized_in, doctor_type, docto_hospital, doctor_schedule) VALUES ('"+doctor.getD_id()+"','"+doctor.getSpecialized_in()+"','"+doctor.getDoctor_type()+"','"+doctor.getD_hospital()+"','"+doctor.getSchedule()+"')";
        Statement st2 = connection.createStatement();
        
            
  
        int executeUpdate = st2.executeUpdate(q2);
        
    return executeUpdate;

        
        
    }
    public static ResultSet getDoctor(Doctor doctor) throws ClassNotFoundException,SQLException{
            try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection connection;
        connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root" , "");
        String s3 ="SELECT emp_id FROM employee_username ORDER BY emp_id DESC LIMIT 1"; //get the doctor id to the doctor reegistration form
        Statement st3 = connection.createStatement();
        
        
        ResultSet result = st3.executeQuery(s3);
       
        
        
        
    return result;
    
    }
}
