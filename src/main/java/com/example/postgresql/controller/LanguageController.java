package com.example.postgresql.controller;

import com.example.postgresql.model.Product.Product;
import com.example.postgresql.model.dictionary.Dictionary;
import com.example.postgresql.model.dictionary.DictionaryDao;
import com.example.postgresql.model.language.Language;
import com.example.postgresql.model.language.LanguageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    LanguageDao languageDao;

    @Autowired
    DictionaryDao dictionaryDao;

    @GetMapping("/language/get-all")
    public List<Language> getAllProducts() {
        return languageDao.getAllEmployees();
    }

    @RequestMapping(value = "/language-dictionary/{language_name}")
    public List<Dictionary> getAllDictionary(@PathVariable("language_name") String language_name) {
        return languageDao.getDictionaryForLanguage(language_name);
    }

    @PostMapping("/language/save")
    public Language save(@RequestBody Language language) {
        return languageDao.save(language);
    }

}
