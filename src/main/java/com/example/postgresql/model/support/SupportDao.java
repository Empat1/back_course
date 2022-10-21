package com.example.postgresql.model.support;

import com.example.postgresql.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SupportDao {

    @Autowired
    private SupportRepository repository;

    public List<Support> getAll(){
        List<Support> supports = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(supports::add);
        return supports;
    }
}
