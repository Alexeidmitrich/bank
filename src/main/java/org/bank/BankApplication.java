package org.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	//MVC = Model View Controller
	/*
	Model - connection with database
	View -
	Controller
	 */

	/*
	GET
	PUT  -  update
	POST - create
	DELETE
	 */
	/*
	Spring Boot Architecture
		Controller
		Service - Business logic
		Repository - Data base
	 */

}
