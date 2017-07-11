/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.controller;

import hospitalmanagementsystem.model.PatientReport;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class PatientReportController {

    private static Connection conn;
    public static int addReport(PatientReport patientReport) throws ClassNotFoundException,SQLException{
        conn=DbConnector.connectDb();
        String q ="INSERT INTO patient_report( patient_id, doctor_id, report_date, reportType) VALUES ('"+patientReport.getPatientId()+"','"+patientReport.getDoctorId()+"','"+patientReport.getReport_date()+"','"+patientReport.getReportType()+"')";
        
        Statement stm = conn.createStatement();
        int exequteQuery = stm.executeUpdate(q);
        
        return exequteQuery;
        
    }
    public static ResultSet getReort(PatientReport patientReport) throws ClassNotFoundException,SQLException{
        conn=DbConnector.connectDb();
        String g ="SELECT * FROM patient_report WHERE  patient_id ='"+patientReport.getPatientId()+"'";
        Statement stm = conn.createStatement();
        ResultSet result = stm.executeQuery(g);
        
        return result;
    }
}
