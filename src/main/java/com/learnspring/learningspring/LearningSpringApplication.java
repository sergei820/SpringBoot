package com.learnspring.learningspring;

import com.learnspring.learningspring.model.Pojo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {

		//To get "Hello world!" on http://localhost:8080/ (like in the HW video, runs index.html as a Web App):
		SpringApplication.run(LearningSpringApplication.class, args);

		//To get "Hello world!" printed in console (as required in Hometask 1.2):
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Pojo homeworkObj = (Pojo) context.getBean("myBean");
		homeworkObj.getMessage();
	}
}
