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
public class InPatient extends Patient{
 
    private String word_no;
    private String date_discharge;
    private String date_admitted;
    private int doctor_id;
    private String bed_number;
    private String desease;
    
    public InPatient(){
    }

    public InPatient( String word_no, String date_discharge,String date_admitted, int doctor_id, String bed_number,String desease,int p_id, String name, String gender, String nic, String dob, String contactno, String address) {
        super(p_id, name, gender, nic, dob, contactno, address);
       
        this.word_no = word_no;
        this.date_admitted = date_admitted;
        this.date_discharge = date_discharge;
        this.doctor_id = doctor_id;
        this.bed_number = bed_number;
        this.desease = desease;
    }

    public String getDate_admitted() {
        return date_admitted;
    }

    public void setDate_admitted(String date_admitted) {
        this.date_admitted = date_admitted;
    }

   

    public String getWord_no() {
        return word_no;
    }

    public void setWord_no(String word_no) {
        this.word_no = word_no;
    }

    public String getDate_discharge() {
        return date_discharge;
    }

    public void setDate_discharge(String date_discharge) {
        this.date_discharge = date_discharge;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getBed_number() {
        return bed_number;
    }

    public void setBed_number(String bed_number) {
        this.bed_number = bed_number;
    }
    
    public String getDesease() {
        return desease;
    }

    public void setDesease(String desease) {
        this.desease = desease;
    }
    
    
}
