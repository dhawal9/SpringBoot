package org.dd.SpringBootInit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.dd.sb.*")
public class NotesAPI {
	
	public static void main(String[] args){
		
		SpringApplication.run(NotesAPI.class, args);
		
	}

}
