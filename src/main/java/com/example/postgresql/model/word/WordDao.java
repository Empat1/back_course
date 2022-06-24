package com.example.postgresql.model.word;

import com.example.postgresql.model.User.Users;
import com.example.postgresql.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordDao {

    @Autowired
    private WordRepository repository;

    public List<Word> getAllEmployees() {
        List<Word> words = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(words::add);
        return words;
    }



}
