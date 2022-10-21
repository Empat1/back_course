package com.example.postgresql.controller;

import com.example.postgresql.model.User.Users;
import com.example.postgresql.model.word.Word;
import com.example.postgresql.model.word.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {

    @Autowired
    private WordDao wordDao;

    @GetMapping("/words/get-all")
    public List<Word> getWord(){
        return wordDao.getAllEmployees();
    }

    @PostMapping("/word/save/{dictionary_id}") //не работает сохраниение слова в бд
    public Word saveWord(@RequestBody Word word , @PathVariable("dictionary_id") int dictionary){
        return this.wordDao.save( word , dictionary );
    }

//    @RequestMapping(value = "word/authorization/{language}/{dictionary}", method = RequestMethod.GET)
//    public Word saveWord(@RequestBody Word word, @PathVariable("language") int language , @PathVariable("dictionary") int dictionary){
//        return wordDao.getAuthorization(login , password);
//    }

//    @RequestMapping(value = "users/authorization/{login}/{password}", method = RequestMethod.GET)
//    public Users authorization(@PathVariable("login") String login , @PathVariable("password") String password){
//        return user.getAuthorization(login , password);
//    }
}
