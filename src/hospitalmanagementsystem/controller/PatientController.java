/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import hospitalmanagementsystem.controller.DbConnector;
import hospitalmanagementsystem.model.InPatient;
import hospitalmanagementsystem.model.OutPatient;

import java.sql.ResultSet;


/**
 *
 * @author PC
 */
public class PatientController {

    private static Connection conn;
    public static int addPatient(Patient patient)throws ClassNotFoundException,SQLException{
      
       
            conn = DbConnector.connectDb();
            String q = "INSERT INTO patient( p_name, p_gender, p_nic, p_dob, p_contacte, p_address) VALUES ('"+patient.getName()+"','"+patient.getGender()+"','"+patient.getNic()+"','"+patient.getDob()+"','"+patient.getContactno()+"','"+patient.getAddress()+"')";
            Statement stm = conn.createStatement();
            int executeUpdate = stm.executeUpdate(q);
              
    return executeUpdate;
    }
    public static ResultSet getPatient(Patient patient)throws ClassNotFoundException,SQLException{
        conn =DbConnector.connectDb();
        String q = "SELECT * FROM patient WHERE p_id='"+patient.getP_id()+"'";
        Statement stm =conn.createStatement();
        
        ResultSet result = stm.executeQuery(q);
        
        return result;
        
    }
     public static int addInPatient(InPatient inpatient)throws ClassNotFoundException,SQLException{
          conn = DbConnector.connectDb();
          String q ="INSERT INTO inpatient(p_id, word_number, admitted_date, date_discharge, doctor_id, bed_number, reason) VALUES ('"+inpatient.getP_id()+"','"+inpatient.getWord_no()+"','"+inpatient.getDate_admitted()+"','"+inpatient.getDate_discharge()+"','"+inpatient.getDoctor_id()+"','"+inpatient.getBed_number()+"','"+inpatient.getDesease()+"')";
          Statement stm = conn.createStatement();
          
          int executeUpdate = stm.executeUpdate(q);
          return executeUpdate;
     }
     
      public static int addOutPatient(OutPatient Outpatient)throws ClassNotFoundException,SQLException{
          conn = DbConnector.connectDb();
          String q ="INSERT INTO outpatient( p_id, doctor_id, date, reason, medicine) VALUES ('"+Outpatient.getP_id()+"','"+Outpatient.getDoctor_id()+"','"+Outpatient.getDate()+"','"+Outpatient.getReason()+"','"+Outpatient.getMedicine()+"')";
          Statement stm = conn.createStatement();
          
          int executeUpdate = stm.executeUpdate(q);
          return executeUpdate;
    
      }
}
