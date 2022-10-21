package com.example.postgresql;


import com.example.postgresql.controller.LearnController;
import com.example.postgresql.controller.WordController;
import com.example.postgresql.model.learn.Learn;
import com.example.postgresql.model.word.Word;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
class PostgresqlApplicationTests {

	@Autowired
	private WordController wordController;


	@Test
	void addEmployeeTest() {
		addEmployee("testServer" , "testServer");
	}

	private void addEmployee(String name, String description) {

	}

	@Test
	void saveWord(){
//		Word word = new Word();
//		word.setWord_text("test");
//		word.setWord_translate("testT");
//		word.setDictionary(1);
//
//		wordController.saveWord(word);

	}

	@Autowired
	private LearnController learnController;

	@Test
	void saveLearn(){
		Learn learn = new Learn();
		learn.setLearn_id(10);
		learn.setUser_id(1);
		learn.setWord_id(10);
		learn.setLearn_good_repetition(10);
		String str="2015-03-31";
		Date date=Date.valueOf(str);
		learn.setLearn_last_repetion(date);


		learnController.saveLearn(learn);
	}

	@Test
	void getLearn(){
		String str="2018-03-31";
		Date date=Date.valueOf(str);

		learnController.updateLearn(1 , 1 , date , false);
	}


}
