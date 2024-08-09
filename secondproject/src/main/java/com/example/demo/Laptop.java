package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lap1")
@Primary
public class Laptop implements IComputer {

	private String lName;
	private int lRam;
	private int lSsd;
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getlRam() {
		return lRam;
	}
	public void setlRam(int lRam) {
		this.lRam = lRam;
	}
	public int getlSsd() {
		return lSsd;
	}
	public void setlSsd(int lSsd) {
		this.lSsd = lSsd;
	}
	
	public void compile() {
		System.out.println("compilation of the code is going on  Laptop. ");
	}
	
	@Override
	public String toString() {
		return "Laptop [lName=" + lName + ", lRam=" + lRam + ", lSsd=" + lSsd + "]";
	}
	
	
}
