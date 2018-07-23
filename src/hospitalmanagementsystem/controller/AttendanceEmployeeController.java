/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;


import hospitalmanagementsystem.model.AttendanceEmployee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class AttendanceEmployeeController {
    public static int addAttendanceEmployee(AttendanceEmployee attendanceEmployee) throws ClassNotFoundException,SQLException{
               
        Connection  conn = DbConnector.connectDb();
       
        String q2 = "INSERT INTO employee_attendence( employee_id, month, date) VALUES ('"+attendanceEmployee.getEmployee_id()+"','"+attendanceEmployee.getMonth()+"','"+attendanceEmployee.getDate()+"')";
        Statement st2 = conn.createStatement();
        
            
  
        int executeUpdate = st2.executeUpdate(q2);
        
    return executeUpdate;
    }
    public static ResultSet countAttendanceEmployee(AttendanceEmployee attendanceEmployee) throws ClassNotFoundException,SQLException{
        Connection conn = DbConnector.connectDb();
        String q ="SELECT month, COUNT(employee_id) AS totalAttendance FROM employee_attendence WHERE employee_id='"+attendanceEmployee.getEmployee_id()+"'And month='"+attendanceEmployee.getMonth()+"' GROUP BY month";
        
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        return result;
    }
    
}
