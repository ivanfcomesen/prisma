package com.grupo.prisma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//6Q5w9IBzy24bNutI


@SpringBootApplication //@ComponentScan(basePackages = { "com.*"})
public class PrismaApplication {

	//@Autowired
	//private TopicRepository topicRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PrismaApplication.class, args);

	}
	
	/*@Override
	public void run(String... args) throws Exception {

		topicRepository.deleteAll();
		// save a couple of customers
		topicRepository.save(new Topic("java", "Java Core", "Java Description"));
		topicRepository.save(new Topic("java","SpringFramework ", "Spring Description"));
		
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();
		
		
		
	}	*/
}
