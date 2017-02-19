package com.blc.training.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * This service offers a single run method which will be called just
 * <b>before</b> SpringApplication.run(…​) completes.
 * 
 * @author LBO
 *
 */
@Service
public class MyApplicationRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">> Hello from the new world");

	}

	@PostConstruct
	public void initMyService() {
		System.out.println(">> Initialize my service");
	}

	@PreDestroy
	public void exitMyService() {
		System.out.println(">> Exit my service");
	}
}
