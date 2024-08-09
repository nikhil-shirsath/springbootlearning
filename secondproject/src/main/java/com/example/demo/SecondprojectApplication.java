package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecondprojectApplication {

	public static void main(String[] args) {
		// this context is a container which contains all the classes 
	ConfigurableApplicationContext context =	SpringApplication.run(SecondprojectApplication.class, args);
//		Alian a = new Alian(); // this is tyght coupling which we dont want
	
	Alian a = context.getBean(Alian.class);
	a.show();
	
	//rnd it will create object of the beans only once of two time 
	// ans  => only one time
	
	Alian a1 = context.getBean(Alian.class);
	a1.show();
	}

}
