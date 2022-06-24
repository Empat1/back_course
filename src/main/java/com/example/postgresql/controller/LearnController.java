package com.example.postgresql.controller;

import com.example.postgresql.model.learn.Learn;
import com.example.postgresql.model.learn.LearnDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LearnController {
    @Autowired
    private LearnDao learnDao;

    @GetMapping("/learn/get-all")
    public List<Learn> getAllLearn(){
        return learnDao.getAllLearn();
    }
}
