/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;


import hospitalmanagementsystem.model.OutPatient;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class OutpatientController {
    private static Connection conn;
    public static int addOutPatient(OutPatient outpatient)throws ClassNotFoundException,SQLException{
        conn = DbConnector.connectDb();
        String q ="INSERT INTO outpatient( p_id, doctor_id, date, reason, medicine) VALUES ('"+outpatient.getP_id()+"','"+outpatient.getDoctor_id()+"','"+outpatient.getDate()+"','"+outpatient.getReason()+"','"+outpatient.getMedicine()+"')";
        Statement stm = conn.createStatement();
       int executeUpdate = stm.executeUpdate(q);
        
    return executeUpdate;
        
    }
}
