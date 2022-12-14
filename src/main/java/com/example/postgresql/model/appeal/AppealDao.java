package com.example.postgresql.model.appeal;

import com.example.postgresql.repository.AppealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppealDao {

    @Autowired
    private AppealRepository repository;

    public List<Appeal> getAll(){
        List<Appeal> appeals = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(appeals::add);
        return appeals;
    }

    public List<Appeal> getAllForUser(int user_id){
        List<Appeal> appeals = new ArrayList<>();
        Streamable.of(repository.findAll())
                .filter(appeal -> appeal.getUser_id() == user_id)
                .forEach(appeals::add);
        return appeals;
    }

    public Appeal getAppeal(int appeal_id){
        List<Appeal> appeals = new ArrayList<>();
        Streamable.of(repository.findAll())
                .filter(appeal -> appeal.getUser_id() == appeal_id)
                .forEach(appeals::add);
        return appeals.get(0);
    }

}
