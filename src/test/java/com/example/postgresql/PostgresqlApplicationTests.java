package com.example.postgresql;


import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostgresqlApplicationTests {



	@Test
	void addEmployeeTest() {
		addEmployee("testServer" , "testServer");
	}

	private void addEmployee(String name, String description) {

	}
}
