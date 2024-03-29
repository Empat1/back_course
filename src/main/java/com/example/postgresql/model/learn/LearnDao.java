package com.example.postgresql.model.learn;

import com.example.postgresql.model.word.Word;
import com.example.postgresql.repository.LearnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

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

    public List<Learn> getCompleteLern(int userId ){
        return Streamable.of(repository.findAll())
                .stream()
                .filter(learn -> learn.getLearn_good_repetition() > 0 )
                .filter(learn -> learn.getUser_id() == userId)
                .collect(Collectors.toList());
    }


    public Set<Integer> getWordId(int userId){
        Set<Learn> learns = new HashSet<>();
        Streamable.of(repository.findAll())
                .stream()
                .filter(learn -> learn.getUser_id() == userId)
                .forEach(learns::add);

        Set<Integer> ids = new HashSet<>();
        for(Learn learn : learns){
            ids.add(learn.getWord_id());
        }

        return ids;
    }


//    private List<Word> getCompleteWord(int userId){
//        List<Word> words = new ArrayList<Word>();
//        return
//        for(Learn learn : getCompleteLern(userId)){
//            Streamable.of(repository.findAllById(learn.getWord_id()));
//        }
//
//    }
    public Learn getLearn(int userId , int wordId){

            return Streamable.of(repository.findAll())
                    .stream()
                    .filter(learn -> learn.getWord_id() == wordId )
                    .filter(learn -> learn.getUser_id() == userId)
                    .findFirst()
                    .get();

    }

    public Learn update(int userId , int wordId, Date date , boolean good_repetition){

        Learn upLearn= null;

        try {
            upLearn =
                    Streamable.of(repository.findAll())
                            .stream()
                            .filter(learn -> learn.getWord_id() == wordId)
                            .filter(learn -> learn.getUser_id() == userId)
                            .findFirst()
                            .get();
        }catch (NoSuchElementException e){

        }

        try {
            repository.delete(getLearn(userId , wordId));
        }catch (Exception e){

        }

        if(upLearn == null){
            upLearn = new Learn();
            upLearn.setUser_id(userId);
            upLearn.setWord_id(wordId);
            upLearn.setLearn_good_repetition(0);
        }

        upLearn.setLearn_last_repetion(date);
        if(good_repetition){
            upLearn.incrementRepetition();
        }

        return saveLearn(upLearn);
    }
    public Learn saveLearn(Learn learn){
        return repository.save(learn);
    }

}
