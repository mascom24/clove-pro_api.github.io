package com.clove_procurement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Clove-Audits")
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;
    private String customerName;
    private String quantity;
    private String dryness;
    private String cLean;
    private String grade;
    public Audit(){}

    public Audit(Long auditId, String customerName, String quantity, String dryness, String cLean, String grade) {
        this.auditId = auditId;
        this.customerName = customerName;
        this.quantity = quantity;
        this.dryness = dryness;
        this.cLean = cLean;
        this.grade = grade;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDryness() {
        return dryness;
    }

    public void setDryness(String dryness) {
        this.dryness = dryness;
    }

    public String getCLean() {
        return cLean;
    }

    public void setCLean(String cLean) {
        this.cLean = cLean;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
