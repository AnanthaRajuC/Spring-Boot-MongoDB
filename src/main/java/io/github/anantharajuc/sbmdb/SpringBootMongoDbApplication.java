package io.github.anantharajuc.sbmdb;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import lombok.extern.log4j.Log4j2;

/**
 * Spring Boot Application Template.
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@Log4j2
@SpringBootApplication
@EnableMongoRepositories("io.github.anantharajuc.sbmdb.repository")
public class SpringBootMongoDbApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
		
		log.info("Spring Boot Application Template started at {}", LocalDateTime.now());	
	}
}
