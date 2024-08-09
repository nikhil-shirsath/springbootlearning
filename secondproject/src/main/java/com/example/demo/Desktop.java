package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements IComputer {

	@Override
	public void compile() {
		
		System.out.println("compile method of Desktop class ");
	}

}
