package com.clove_procurement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String address;
    private String phone;
    private String chet;
    private String date;
    public Customer (){}

    public Customer(Long customerId, String name, String address, String phone, String chet, String date) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.chet = chet;
        this.date = date;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChet() {
        return chet;
    }

    public void setChet(String chet) {
        this.chet = chet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
