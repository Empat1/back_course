package com.example.postgresql.model.sub;

import com.example.postgresql.repository.SubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubDao {
    
    @Autowired
    private SubRepository repository;

    public Sub save(Sub sub) {
        return repository.save(sub);
    }

    public List<Sub> getAllEmployees() {
        List<Sub> subs = new ArrayList<>();
        repository.toString();
        Streamable.of(repository.findAll())
                .forEach(subs::add);
        return subs;
    }
}
