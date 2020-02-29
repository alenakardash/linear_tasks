package com.company.training.linear;

//Даны натуральные числа M и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M / N

public class Task35 {
	
	public static void main(String[] args) {
		
		double m;
		double n;
		double quotient;
		
		m = 4536;
		n = 39;
		
		quotient = m / n;
		
		int temp;
		
		temp = (int) quotient;

		int young;
		double old;
		
		young = temp % 10;
		
		old = (quotient - temp) * 10;
		
		
	    int old1;
		
		old1 = (int) old;
		
		
		System.out.println("Старшая цифра дробной части числа " + quotient + " = " + old1);
		
		System.out.println("Младшая цифра целой части числа " + quotient + " = " + young);
		
		
		
		
	}

}
