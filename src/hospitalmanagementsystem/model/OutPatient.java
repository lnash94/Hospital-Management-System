/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.model;

/**
 *
 * @author PC
 */
public class OutPatient extends Patient{
    private int doctor_id;
    private String date;
    private  String Reason;
    private String medicine;
    
    
    public OutPatient(){
        
    }

    public OutPatient(int doctor_id, String date, String Reason, String medicine) {
        this.doctor_id = doctor_id;
        this.date = date;
        this.Reason = Reason;
        this.medicine = medicine;
    }



    public OutPatient(int doctor_id, String date, String Reason, String medicine, int p_id, String name, String gender, String nic, String dob, String contactno, String address) {
        super(p_id, name, gender, nic, dob, contactno, address);
        this.doctor_id = doctor_id;
        this.date = date;
        this.Reason = Reason;
        this.medicine = medicine;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    
}
