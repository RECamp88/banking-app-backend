package com.revature.training.BankingApplication;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BankingApplication {

	public static Logger log = LogManager.getLogger(BankingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class);
	}

}