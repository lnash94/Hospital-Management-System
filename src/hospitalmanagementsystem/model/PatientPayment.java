/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.model;

import java.math.BigDecimal;
import java.util.Date;
import java.text.DecimalFormat;

/*
 *
 * @author PC
 */
public class PatientPayment {
    private int P_id;
    private String date;
    private BigDecimal payment;
    private  String paid;

    public PatientPayment() {
    }

    public PatientPayment(int P_id, String date, BigDecimal payment,String paid) {
        this.P_id = P_id;
        this.date = date;
        this.payment = payment;
        this.paid=paid;
    }

    public int getP_id() {
        return P_id;
    }

    public void setP_id(int P_id) {
        this.P_id = P_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }
    
}
