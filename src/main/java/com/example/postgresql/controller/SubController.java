package com.example.postgresql.controller;

import com.example.postgresql.model.sub.Sub;
import com.example.postgresql.model.sub.SubDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubController {

    @Autowired
    SubDao subDao;

    @GetMapping("/sub/get-all")
    public List<Sub> getAllProducts() {
        return subDao.getAllEmployees();
    }

    @PostMapping("/sub/save")
    public Sub save(@RequestBody Sub sub) {
        return subDao.save(sub);
    }
}
