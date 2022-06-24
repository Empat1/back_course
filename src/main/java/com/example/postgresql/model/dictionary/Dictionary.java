package com.example.postgresql.model.dictionary;

import com.example.postgresql.model.word.Word;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_dictionary;

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

    public int getId_dictionary() {
        return id_dictionary;
    }

    public void setId_dictionary(int id_dictionary) {
        this.id_dictionary = id_dictionary;
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
