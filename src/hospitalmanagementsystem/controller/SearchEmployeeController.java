/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.Doctor;
import hospitalmanagementsystem.model.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class SearchEmployeeController {
    //getting all details about doctor.
    public static ResultSet getDoctordetails(Doctor doctor1) throws ClassNotFoundException,SQLException{
        Connection conn = DbConnector.connectDb();
        String q = "SELECT employee_username.emp_id ,employee_username.emp_name ,employee_username.emp_gender ,employee_username.emp_contact ,employee_username.emp_address,employee_username.emp_email,employee_username.emp_occupation,employee_username.emp_nic,employee_username.emp_dob,employee_username.emp_joindate,doctor.specialized_in,doctor.doctor_type,doctor.docto_hospital,doctor.doctor_schedule\n" +
        "FROM employee_username\n" +
        "INNER JOIN doctor ON employee_username.emp_id=doctor.emp_id AND employee_username.emp_id='"+doctor1.getEmp_id()+"';";
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        return result;
        
        
    }
    public static ResultSet getDoctordetailsDate(Doctor doctor2) throws ClassNotFoundException,SQLException{
        Connection conn = DbConnector.connectDb();
        String q = "SELECT employee_username.emp_id ,employee_username.emp_name ,employee_username.emp_gender ,employee_username.emp_contact ,doctor.specialized_in,doctor.doctor_type,doctor.docto_hospital,doctor.doctor_schedule\n" +
        "FROM employee_username\n" +
        "INNER JOIN doctor ON employee_username.emp_id=doctor.emp_id AND doctor.specialized_in ='"+doctor2.getSpecialized_in()+"' AND doctor.doctor_schedule='"+doctor2.getSchedule()+"';";
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        return result;
        
        
    }
}
