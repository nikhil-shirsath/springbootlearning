package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //using this scope you will create this object multiple times.
// using this scope annottion it will not create a default object for us untile we calls getBean(class name 

public class Alian {
	private int aid;
	private String aname;
	private int age ;
	
	//I want that i can call comiping method of laptop class init .
	// Its part of another class so how can i call it .
	// For that autowired is comes in the picture
	@Autowired //this tells the alian class that we have a componenet of named laptop go and search for it. 
	//If we not uses this autowired keyword then our code gets null pointer exeption. 
	private Laptop laptop;
	
	
	
	public Alian() {
		System.out.println("inside the Alian constructor object crated ");
	}
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
	System.out.println("in show method ");
	laptop.compile();
	}

}
