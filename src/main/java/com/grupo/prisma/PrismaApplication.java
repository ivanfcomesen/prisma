package com.grupo.prisma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication //@ComponentScan(basePackages = { "com.*"})
public class PrismaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(PrismaApplication.class, args);
		
		/*6Q5w9IBzy24bNutI
		
		MongoClientURI uri = new MongoClientURI(
				   "mongodb://ivanfcomesen:<Gxpz36Is4XrCyqnn>@geminis-shard-00-00-gsyv1.mongodb.net:27017,geminis-shard-00-01-gsyv1.mongodb.net:27017,geminis-shard-00-02-gsyv1.mongodb.net:27017/test?ssl=true&replicaSet=Geminis-shard-0&authSource=admin");

				MongoClient mongoClient = new MongoClient(uri);
				MongoDatabase database = mongoClient.getDatabase("test");*/
		
		
		

	}
}
