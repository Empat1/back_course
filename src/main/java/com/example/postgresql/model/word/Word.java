package com.example.postgresql.model.word;

import com.example.postgresql.model.dictionary.Dictionary;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "word")
public class Word{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int word_id;

    @ManyToOne(fetch = FetchType.LAZY , optional = false)
    @JoinColumn(name ="id_dictionary" , nullable = false)
    private Dictionary dictionary;
    private String word_text;
    private String word_translate;


    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
        dictionary.getWords().add(this);
    }

    public int getWord_id() {
        return word_id;
    }

    public void setWord_id(int word_id) {
        this.word_id = word_id;
    }


    public String getWord_text() {
        return word_text;
    }

    public void setWord_text(String word_text) {
        this.word_text = word_text;
    }

    public String getWord_translate() {
        return word_translate;
    }

    public void setWord_translate(String word_translate) {
        this.word_translate = word_translate;
    }


    @Override
    public String toString() {
        return "Word{" +
                "word_id=" + word_id +
                ", word_text='" + word_text + '\'' +
                ", word_translate='" + word_translate + '\'' +
                '}';
    }
}
