package com.company.training.linear;

//Даны два действительных числа x и y. Вычислить их сумму, разность, произведение и частное.

public class Task1 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = 10;
		y = 2;
		
		double sum;
		double subtr;
		double multipl;
		double divis;
		
		sum = x + y;
		
		System.out.println("Result of addition is " + sum);
		
		subtr = x - y;
		
		System.out.println("Result of subtraction is " + subtr);
		
		multipl = x * y;
		
		System.out.println("Result of multiplication is " + multipl);
		
		divis = x / y;
		
		System.out.println("Result of division is " + divis);
		
		}
}
