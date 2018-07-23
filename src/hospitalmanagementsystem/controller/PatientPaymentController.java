/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.PatientPayment;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class PatientPaymentController {
    
    public static int addPayment(PatientPayment pPayment) throws CloneNotSupportedException,SQLException{
        Connection con = DbConnector.connectDb();
        
        String q ="INSERT INTO patientPayment(patient_id, date, payment, Patient_paid ) VALUES ('"+pPayment.getP_id()+"','"+pPayment.getDate()+"','"+pPayment.getPayment()+"','"+pPayment.getPaid()+"')";
        Statement stm = con.createStatement();
        
        int executeUpdt = stm.executeUpdate(q);
        
        return executeUpdt;
        
    }
    
    public static  ResultSet getPayment(PatientPayment pPayment) throws ClassNotFoundException,SQLException{
        Connection con = DbConnector.connectDb();
        String q1 = "SELECT patient.p_id, patient.p_name ,patientpayment.date,patientpayment.patient_id ,SUM(patientpayment.payment) AS payment_patient,patientpayment.Patient_paid\n" +
        "FROM patient\n" +
        "INNER JOIN patientpayment ON patient.p_id = patientpayment.patient_id AND patientpayment.Patient_paid='Not paid' AND patient.p_id='"+pPayment.getP_id()+"'";
        
       Statement stm = con.createStatement();
       
       ResultSet exequte = stm.executeQuery(q1);
       
       return exequte;
        
    }
}
