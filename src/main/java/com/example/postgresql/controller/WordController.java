package com.example.postgresql.controller;

import com.example.postgresql.model.User.Users;
import com.example.postgresql.model.learn.Learn;
import com.example.postgresql.model.learn.LearnDao;
import com.example.postgresql.model.word.Word;
import com.example.postgresql.model.word.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class WordController {

    @Autowired
    private WordDao wordDao;

    @Autowired
    private LearnDao learnDao;

    @GetMapping("/words/get-all")
    public List<Word> getWord(){
        return wordDao.getAllEmployees();
    }

//    @GetMapping("/words/{learn_id}")
//    public List<Word> getWord(){
//        return wordDao.getAllEmployees();
//    }

    @GetMapping("/word_for_learn/{user_id}")
    public List<Word> wordLearn(@PathVariable("user_id") int user_id){
        Set<Integer> learnSet =learnDao.getWordId(user_id);
        List<Word> words = new ArrayList<>();

        for(Word word: wordDao.getAllEmployees()){
            if(learnSet.add(word.getWord_id()))
                words.add(word);
        }
        return words;

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
