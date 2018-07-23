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
public class Employee {
    private int emp_id;
    private String emp_name;
    private String emp_username;
    private String emp_password;
    private String emp_gender;
    private String emp_contact;
    private String emp_address;
    private String emp_email;
    private String emp_ocuppation;
    private String emp_dob;
    private String emp_nic;
    private String emp_joineddate;
    
    public Employee(){
    }

    

    public Employee(int emp_id,String emp_name, String emp_username, String emp_password, String emp_gender, String emp_contact, String emp_address, String emp_email, String emp_ocuppation, String emp_dob, String emp_nic, String emp_joineddate) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_username = emp_username;
        this.emp_password = emp_password;
        this.emp_gender = emp_gender;
        this.emp_contact = emp_contact;
        this.emp_address = emp_address;
        this.emp_email = emp_email;
        this.emp_ocuppation = emp_ocuppation;
        this.emp_dob = emp_dob;
        this.emp_nic = emp_nic;
        this.emp_joineddate = emp_joineddate;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_username() {
        return emp_username;
    }

    public void setEmp_username(String emp_username) {
        this.emp_username = emp_username;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_contact() {
        return emp_contact;
    }

    public void setEmp_contact(String emp_contact) {
        this.emp_contact = emp_contact;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_ocuppation() {
        return emp_ocuppation;
    }

    public void setEmp_ocuppation(String emp_ocuppation) {
        this.emp_ocuppation = emp_ocuppation;
    }

    public String getEmp_dob() {
        return emp_dob;
    }

    public void setEmp_dob(String emp_dob) {
        this.emp_dob = emp_dob;
    }

    public String getEmp_nic() {
        return emp_nic;
    }

    public void setEmp_nic(String emp_nic) {
        this.emp_nic = emp_nic;
    }

    public String getEmp_joineddate() {
        return emp_joineddate;
    }

    public void setEmp_joineddate(String emp_joineddate) {
        this.emp_joineddate = emp_joineddate;
    }
    
    
    
    
}

    
    


















