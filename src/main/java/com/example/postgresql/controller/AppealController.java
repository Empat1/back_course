package com.example.postgresql.controller;

import com.example.postgresql.model.appeal.Appeal;
import com.example.postgresql.model.appeal.AppealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppealController {

    @Autowired
    AppealDao appealDao;

    @GetMapping("/appeal/get-all")
    public List<Appeal> getAll(){
        return appealDao.getAll();
    }

    @GetMapping("/appeal/get-user/{user_id}")
    public List<Appeal> getForUser(@PathVariable("user_id") int user_id ){
        return appealDao.getAllForUser(user_id);
    }

    @GetMapping("/appeal/{appeal_id}")
    public Appeal get(@PathVariable("appeal_id") int appeal_id ){
        return appealDao.getAppeal(appeal_id);
    }

}
