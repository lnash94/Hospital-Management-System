/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.InPatient;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class InpatientController {

    private static Connection conn;
    public static int addPatient(InPatient inpatient)throws ClassNotFoundException,SQLException{
        conn = DbConnector.connectDb();
        String q ="INSERT INTO inpatient(p_id, word_number, date_discharge, doctor_id, bed_number, reason) VALUES ('"+inpatient.getP_id()+"','"+inpatient.getWord_no()+"','"+inpatient.getDate_discharge()+"','"+inpatient.getDoctor_id()+"','"+inpatient.getBed_number()+"','"+inpatient.getDesease()+"')";
        Statement stm = conn.createStatement();
       int executeUpdate = stm.executeUpdate(q);
        
    return executeUpdate;
        
    }
    
}
