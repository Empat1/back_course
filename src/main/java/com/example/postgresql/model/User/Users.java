package com.example.postgresql.model.User;

import com.example.postgresql.model.language.Language;
import com.example.postgresql.model.permission.Permission;
import com.example.postgresql.model.sub.Sub;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int user_id;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "sub_id")
//    private Sub sub;

    private int sub_id;
    private String user_name;
    private String user_language;
    private String user_login;
    private String user_password;
    private Date sub_end;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinTable(name = "language" , joinColumns = @JoinColumn(name = "user_id") , inverseJoinColumns = @JoinColumn(name = "language_id"))

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "know", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "language_id")})
    private List<Language> languages;

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }



    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_language() {
        return user_language;
    }

    public void setUser_language(String user_language) {
        this.user_language = user_language;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Date getSub_end() {
        return sub_end;
    }

    public void setSub_end(Date sub_end) {
        this.sub_end = sub_end;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + user_id +
                ", sub_id=" + sub_id +
                ", user_name='" + user_name + '\'' +
                ", language='" + user_language + '\'' +
                ", login='" + user_login + '\'' +
                ", password='" + user_password + '\'' +
                ", subEnd=" + sub_end +
                '}';
    }
}
