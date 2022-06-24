package com.example.postgresql.model.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KnowController {

    @Autowired
    KnowDao knowDao;

//    @GetMapping("know/get-all")
//    public List<Know> getAll(){
//        return knowDao.getAll();
//    }
}
