package com.example.postgresql.model.learn;

import com.example.postgresql.repository.LearnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LearnDao {

    @Autowired
    private LearnRepository repository;

    public List<Learn> getAllLearn(){
        List<Learn> learns = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(learns::add);
        return learns;
    }

}
