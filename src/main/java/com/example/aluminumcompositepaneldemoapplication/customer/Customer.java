package com.example.aluminumcompositepaneldemoapplication.customer;

import javax.persistence.*;
import java.time.LocalDate;

// this what we need to mab our application thr the database.
@Entity
@Table
public class Customer {
//  using these dependencies injections to mab to database.
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
//  these values are recommended for PostGreSQL
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;
    private String fistName;
    private String surName;
    private String email;
    private String nationality;
    private Integer age;
    private LocalDate dob;
    private String phoneNumber;
    private String Address;

    public Customer(){}
    public Customer(String fistName,
                    String surName,
                    String email,
                    String nationality,
                    Integer age,
                    LocalDate dob,
                    String phoneNumber,
                    String address) {
        this.fistName = fistName;
        this.surName = surName;
        this.email = email;
        this.nationality = nationality;
        this.age = age;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        Address = address;
    }
    public Customer(Long id,
                    String fistName,
                    String surName,
                    String email,
                    String nationality,
                    Integer age,
                    LocalDate dob,
                    String phoneNumber,
                    String address) {
        this.id = id;
        this.fistName = fistName;
        this.surName = surName;
        this.email = email;
        this.nationality = nationality;
        this.age = age;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        Address = address;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFistName() {
        return fistName;
    }
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fistName='" + fistName + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", phoneNumber=" + phoneNumber +
                ", Address='" + Address + '\'' +
                '}';
    }
}
