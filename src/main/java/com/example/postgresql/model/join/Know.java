package com.example.postgresql.model.join;

import com.example.postgresql.model.language.Language;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Know {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer know_id;

    private int language_id;
    private int user_id;


    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
