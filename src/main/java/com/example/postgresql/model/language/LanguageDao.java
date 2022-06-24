package com.example.postgresql.model.language;

import com.example.postgresql.model.Product.Product;
import com.example.postgresql.model.dictionary.Dictionary;
import com.example.postgresql.model.dictionary.DictionaryDao;
import com.example.postgresql.repository.DictionaryRepository;
import com.example.postgresql.repository.LanguageRepository;
import com.example.postgresql.repository.ProductRepository;
import com.example.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LanguageDao {

    @Autowired
    private LanguageRepository repository;

    @Autowired
    private DictionaryRepository repositoryDictionary;


    public Language save(Language language) {
        return repository.save(language);
    }

    public List<Language> getAllEmployees() {
        List<Language> languages = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(languages::add);
        return languages;
    }

    public List<Dictionary> getDictionaryForLanguage(String name_language){
        List<Dictionary> dictionaries = new ArrayList<>();

        for(Language language: Streamable.of(repository.findAll())){
            if(language.getLanguage_name().equals(name_language)){
                for(Dictionary dictionary : Streamable.of(repositoryDictionary.findAll())){
                    if(dictionary.getLanguage_id() == language.getLanguage_id()){
                        dictionaries.add(dictionary);
                    }
                }
            }
        }

        return dictionaries;
    }


}
