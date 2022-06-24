package com.example.postgresql.model.sub;

import com.example.postgresql.model.User.Users;

import javax.persistence.*;
import java.sql.Date;
import java.util.Currency;
import java.util.Set;

@Entity
public class Sub {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int sub_id;

//    @OneToMany(fetch = FetchType.EAGER , mappedBy = "sub", cascade = CascadeType.ALL)
//    private Set<Users> users;//не нашел способ избежать цикла

    private String sub_name;
    private Double sub_price;
    private Date sub_time;

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public Double getSub_price() {
        return sub_price;
    }

    public void setSub_price(Double sub_price) {
        this.sub_price = sub_price;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public Date getSub_time() {
        return sub_time;
    }

    public void setSub_time(Date sub_time) {
        this.sub_time = sub_time;
    }

//    public Set<Users> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<Users> users) {
//        this.users = users;
//    }
}
