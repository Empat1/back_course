package com.example.postgresql.model.dictionary;

import com.example.postgresql.model.word.Word;
import com.example.postgresql.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DictionaryDao {
    @Autowired
    private DictionaryRepository repository;

    public Dictionary save(Dictionary dictionary) {
        return repository.save(dictionary);
    }

    public List<Dictionary> getAllEmployees() {
        List<Dictionary> dictionarys = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(dictionarys::add);
        return dictionarys;
    }

    public List<Word> getWordForLanguage(int language_id, int dictionary_id){
        List<Dictionary> dictionaries = new ArrayList<>();
        for(Dictionary dictionary : repository.findAll()){
            if (dictionary.getLanguage_id() == language_id)
                if(dictionary.getDictionary_id() == dictionary_id){
                    return dictionary.getWords();
                }
        }

        return null;
    }
}
