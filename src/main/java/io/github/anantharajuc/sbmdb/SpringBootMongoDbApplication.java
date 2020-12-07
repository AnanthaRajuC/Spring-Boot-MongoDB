package io.github.anantharajuc.sbmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Spring Boot Application Template.
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@SpringBootApplication
@EnableMongoRepositories("io.github.anantharajuc.sbmdb.repository")
public class SpringBootMongoDbApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}
}
