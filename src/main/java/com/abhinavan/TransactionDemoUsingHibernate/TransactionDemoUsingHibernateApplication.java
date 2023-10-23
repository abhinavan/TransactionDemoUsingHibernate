package com.abhinavan.TransactionDemoUsingHibernate;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import com.abhinavan.TransactionDemoUsingHibernate.controller.GreetingController;

@SpringBootApplication
@EnableTransactionManagement
@RestController
@EnableEurekaClient
public class TransactionDemoUsingHibernateApplication implements GreetingController {

	@Value("${spring.application.name}")
	private String appName;

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(TransactionDemoUsingHibernateApplication.class, args);
	}

	@Override
	public String greeting() {
		return String.format("Hello "+ eurekaClient.getApplication(appName).getName());
	}
}
