/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.model;

import java.io.File;

/**
 *
 * @author PC
 */
public class PatientReport {
    private int reportId;
    private int patientId;
    private int doctorId;
    private String report_date;
    private String reportType;
    private byte[] report;

    public PatientReport() {
    }
    
    
    
    

    public PatientReport(int reportId, int patientId, int doctorId, String report_date, String reportType, byte[] report) {
        this.reportId = reportId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.report_date = report_date;
        this.reportType = reportType;
        this.report = report;
    }

    
    
    
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public byte[] getReport() {
        return report;
    }

    public void setReport(byte[] report) {
        this.report = report;
    }
    
    
}
