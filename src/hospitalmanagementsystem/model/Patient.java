/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.model;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Patient {
    
    private int p_id;
    private String name;
    private String gender;
    private String nic;
    private String dob;
    private String contactno;
    private String address;

    public Patient() {
        
    }

    public Patient(String name, String gender, String nic, String dob, String contactno, String address) {
        this.name = name;
        this.gender = gender;
        this.nic = nic;
        this.dob = dob;
        this.contactno = contactno;
        this.address = address;
    }
    
     public Patient(int p_id, String name, String gender, String nic, String dob, String contactno, String address) {
        this.p_id = p_id;
        this.name = name;
        this.gender = gender;
        this.nic = nic;
        this.dob = dob;
        this.contactno = contactno;
        this.address = address;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    
    
}
