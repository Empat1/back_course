package com.example.postgresql.model.learn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Learn {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int learn_id;
    private int user_id;
    private int word_id;
    private int learn_good_repetition;
    private Date learn_last_repetion;


    public int getLearn_id() {
        return learn_id;
    }

    public void setLearn_id(int learn_id) {
        this.learn_id = learn_id;
    }


    public int getWord_id() {
        return word_id;
    }

    public void setWord_id(int word_id) {
        this.word_id = word_id;
    }

    public int getLearn_good_repetition() {
        return learn_good_repetition;
    }

    public void setLearn_good_repetition(int learn_good_repetition) {
        this.learn_good_repetition = learn_good_repetition;
    }

    public Date getLearn_last_repetion() {
        return learn_last_repetion;
    }

    public void setLearn_last_repetion(Date learn_last_repetion) {
        this.learn_last_repetion = learn_last_repetion;
    }
}
