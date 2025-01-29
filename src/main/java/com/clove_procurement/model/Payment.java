package com.clove_procurement.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private String customer;
    private String quantity;
    private String grade;
    private Double amount;
    private String date;
    private String confirmation;
    public Payment(){}

    public Payment(Long paymentId, String customer, String quantity, String grade, Double amount, String date, String confirmation) {
        this.paymentId = paymentId;
        this.customer = customer;
        this.quantity = quantity;
        this.grade = grade;
        this.amount = amount;
        this.date = date;
        this.confirmation = confirmation;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }
}
