package com.abhinavan.TransactionDemoUsingHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionDemoUsingHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionDemoUsingHibernateApplication.class, args);
	}

}
