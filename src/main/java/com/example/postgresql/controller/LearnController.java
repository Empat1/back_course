package com.example.postgresql.controller;

import com.example.postgresql.model.learn.Learn;
import com.example.postgresql.model.learn.LearnDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class LearnController {
    @Autowired
    private LearnDao learnDao;


    @GetMapping("/learn/get-all")
    public List<Learn> getAllLearn(){
        return learnDao.getAllLearn();
    }

//    @GetMapping("/learn/get-complete_word_size/{user_id}")
//    public int getCompleteWordSize(@PathVariable("user_id") int userId){
//
//        return learnDao.getCompleteLern(userId).size();
//    }

    @GetMapping("/learn/get-complete_word_size/{user_id}")
    public int getCompleteWord(@PathVariable("user_id") int userId){

        return learnDao.getCompleteLern(userId).size();
    }

    @GetMapping("/learn/{user_id}/{word_id}")
    public Learn getLearn(@PathVariable("user_id") int userId, @PathVariable("word_id") int wordId ){
        return learnDao.getLearn(userId , wordId);
    }


    @GetMapping("/learn/{user_id}/{word_id}/{date}/{good}")
    public Learn updateLearn(@PathVariable("user_id") int userId, @PathVariable("word_id") int wordId, @PathVariable("date")Date date, @PathVariable("good") boolean good){
        return learnDao.update(userId , wordId , date , good);
    }
    @RequestMapping(value = "/learn/save")
    public Learn saveLearn(@RequestBody Learn learn){return learnDao.saveLearn(learn);}


//
//    @RequestMapping(value = /le)
//    public LearnUp(){
//
//    }
}
