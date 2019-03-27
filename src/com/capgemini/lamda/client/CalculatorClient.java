package com.capgemini.lamda.client;

import com.capgemini.lamda.model.Calculator;

public class CalculatorClient {
	
	public static void main(String []args) {
		
		Calculator addition =(x,y)->x+y;
		System.out.println(addition.calculate(2, 3));
	}
	
	
}

