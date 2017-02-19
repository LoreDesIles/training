package com.blc.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the entry point of my executable JAR
 * @author LBO
 *
 */
@SpringBootApplication
public class MyApplicationEntry {


    public static void main(String[] args) {
        SpringApplication.run(MyApplicationEntry.class, args);
    }
	
}
