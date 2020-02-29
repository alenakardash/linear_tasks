package com.company.training.linear;

//Три сопротивления R1, R2, R3 соединены параллельно.Найти сопротивление этого соединения.

public class Task30 {
	
	public static void main(String[] args) {
		
		double r1;
		double r2;
		double r3;
		double result;
		
		r1 = 5;
		r2 = 3;
		r3 = 4;
		
		double temp;
		
		temp = 1 / r1 + 1 / r2 + 1 / r3;
		
		result = 1 / temp;
		
		
		System.out.print("Resistance is " + result + " Om");
		
	}

}
