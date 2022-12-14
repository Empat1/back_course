package com.example.postgresql.model.appeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Appeal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int appeal_id;

    private Integer support_id;
    private int user_id;
    private int appeal_type;
    private Date appeal_date;
    private String appeal_description;
    private String appeal_answer;

    public int getAppeal_id() {
        return appeal_id;
    }

    public void setAppeal_id(int appeal_id) {
        this.appeal_id = appeal_id;
    }

    public Integer getSupport_id() {
        return support_id;
    }

    public void setSupport_id(Integer support_id) {
        this.support_id = support_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAppeal_type() {
        return appeal_type;
    }

    public void setAppeal_type(int appeal_type) {
        this.appeal_type = appeal_type;
    }

    public Date getAppeal_date() {
        return appeal_date;
    }

    public void setAppeal_date(Date appeal_date) {
        this.appeal_date = appeal_date;
    }

    public String getAppeal_description() {
        return appeal_description;
    }

    public void setAppeal_description(String appeal_description) {
        this.appeal_description = appeal_description;
    }

    public String getAppeal_answer() {
        return appeal_answer;
    }

    public void setAppeal_answer(String appeal_answer) {
        this.appeal_answer = appeal_answer;
    }
}
