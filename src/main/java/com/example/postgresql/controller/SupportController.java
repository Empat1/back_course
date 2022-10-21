package com.example.postgresql.controller;

import com.example.postgresql.model.support.Support;
import com.example.postgresql.model.support.SupportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupportController {
    @Autowired
    SupportDao supportDao;

    @GetMapping("/support/get-all")
    public List<Support> getAll(){
        return supportDao.getAll();
    }
}
