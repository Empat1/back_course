package com.example.postgresql.controller;

import com.example.postgresql.model.appeal.Appeal;
import com.example.postgresql.model.appeal.AppealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
