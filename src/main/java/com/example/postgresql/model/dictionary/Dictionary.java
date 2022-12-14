package com.example.postgresql.model.dictionary;

import com.example.postgresql.model.word.Word;

import javax.persistence.*;
import java.util.List;

@Entity
public class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int dictionary_id;

    @OneToMany(mappedBy = "dictionary" , fetch =  FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Word> words;
    private int language_id;
    private String dictionary_name;

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public int getDictionary_id() {
        return dictionary_id;
    }

    public void setDictionary_idid(int dictionary_id) {
        this.dictionary_id = dictionary_id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getDictionary_name() {
        return dictionary_name;
    }

    public void setDictionary_name(String dictionary_name) {
        this.dictionary_name = dictionary_name;
    }
}
