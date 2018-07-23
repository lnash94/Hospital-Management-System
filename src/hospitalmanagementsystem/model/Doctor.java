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
public class Doctor extends Employee {
    private int d_id;
    private String specialized_in;
    private String doctor_type;
    private String schedule;
    private  String d_hospital;
    
    public Doctor(){
    }

    public Doctor(String specialized_in, String doctor_type, String schedule,String d_hospital, int emp_id, String emp_name, String emp_username, String emp_password, String emp_gender, String emp_contact, String emp_address, String emp_email, String emp_ocuppation, String emp_dob, String emp_nic, String emp_joineddate) {
        super(emp_id, emp_name, emp_username, emp_password, emp_gender, emp_contact, emp_address, emp_email, emp_ocuppation, emp_dob, emp_nic, emp_joineddate);
        this.specialized_in = specialized_in;
        this.doctor_type = doctor_type;
        this.schedule = schedule;
        this.d_hospital=d_hospital;
    }

    public Doctor(int d_id,String specialized_in, String doctor_type, String schedule,String d_hospital) {
        this.specialized_in = specialized_in;
        this.doctor_type = doctor_type;
        this.schedule = schedule;
        this.d_hospital=d_hospital;
        this.d_id=d_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getSpecialized_in() {
        return specialized_in;
    }

    public void setSpecialized_in(String specialized_in) {
        this.specialized_in = specialized_in;
    }

    public String getDoctor_type() {
        return doctor_type;
    }

    public void setDoctor_type(String doctor_type) {
        this.doctor_type = doctor_type;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getD_hospital() {
        return d_hospital;
    }

    public void setD_hospital(String d_hospital) {
        this.d_hospital = d_hospital;
    }
    
}
