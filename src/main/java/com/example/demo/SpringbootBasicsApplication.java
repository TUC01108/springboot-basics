package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootBasicsApplication.class, args);
		String allBeans[] = context.getBeanDefinitionNames();
		
		Arrays.sort(allBeans);
		
		for(String temp:allBeans) {
			System.out.println(temp);
		}
	}
	
	
}
