package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class AppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSpringApplication.class, args);

		System.out.println("Hellow world");
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("Lets inspect the beans provided by spring : ");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames){
//				System.out.println(beanName);
//			}
//		};
//	}



}
