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
public class AttendanceEmployee {
    private int employee_id;
    private String month;
    private String date;

    public AttendanceEmployee() {
    }

    public AttendanceEmployee(int employee_id, String month, String date) {
        this.employee_id = employee_id;
        this.month = month;
        this.date = date;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
