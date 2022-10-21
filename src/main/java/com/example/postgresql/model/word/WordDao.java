package com.example.postgresql.model.word;

import com.example.postgresql.model.User.Users;
import com.example.postgresql.model.dictionary.Dictionary;
import com.example.postgresql.model.dictionary.DictionaryDao;
import com.example.postgresql.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class WordDao {

    @Autowired
    private WordRepository repository;

    @Autowired
    DictionaryDao dictionaryDao;

    public List<Word> getAllEmployees() {
        List<Word> words = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(words::add);
        return words;
    }

    public Word save( Word word, int dictionaryId){
        dictionaryDao.getAllEmployees().forEach(new Consumer<Dictionary>() {
            @Override
            public void accept(Dictionary dictionary) {
                if(dictionary.getId_dictionary() == dictionaryId){
                    word.setDictionary(dictionary);
                }
            }
        });

        return repository.save(word);
    }

}
