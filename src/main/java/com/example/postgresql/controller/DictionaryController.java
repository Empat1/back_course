package com.example.postgresql.controller;

import com.example.postgresql.model.dictionary.Dictionary;
import com.example.postgresql.model.dictionary.DictionaryDao;
import com.example.postgresql.model.word.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class DictionaryController {
    @Autowired
    DictionaryDao dictionaryDao;

    @GetMapping("/dictionary/get-all")
    public List<Dictionary> getAllProducts() {
        return dictionaryDao.getAllEmployees();
    }

    @PostMapping("/dictionary/save")
    public Dictionary save(@RequestBody Dictionary dictionary) {
        return dictionaryDao.save(dictionary);
    }

    @RequestMapping(value = "/words/{language_id}/{dictionary_id}", method = RequestMethod.GET)
    public List<Word> getWord(@PathVariable("language_id") int language_id , @PathVariable("dictionary_id") int dictionary_id){
        return dictionaryDao.getWordForLanguage(language_id, dictionary_id);
    }
}
