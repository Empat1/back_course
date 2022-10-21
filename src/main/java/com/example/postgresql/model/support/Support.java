package com.example.postgresql.model.support;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int support_id;
    private String support_surname;
    private String support_name;
    private String support_patronymic;
    private String support_phone;
    private String support_login;
    private String support_password ;

    public int getSupport_id() {
        return support_id;
    }

    public void setSupport_id(int support_id) {
        this.support_id = support_id;
    }

    public String getSupport_surname() {
        return support_surname;
    }

    public void setSupport_surname(String support_surname) {
        this.support_surname = support_surname;
    }

    public String getSupport_name() {
        return support_name;
    }

    public void setSupport_name(String support_name) {
        this.support_name = support_name;
    }

    public String getSupport_patronymic() {
        return support_patronymic;
    }

    public void setSupport_patronymic(String support_patronymic) {
        this.support_patronymic = support_patronymic;
    }

    public String getSupport_phone() {
        return support_phone;
    }

    public void setSupport_phone(String support_phone) {
        this.support_phone = support_phone;
    }

    public String getSupport_login() {
        return support_login;
    }

    public void setSupport_login(String support_login) {
        this.support_login = support_login;
    }

    public String getSupport_password() {
        return support_password;
    }

    public void setSupport_password(String support_password) {
        this.support_password = support_password;
    }
}
