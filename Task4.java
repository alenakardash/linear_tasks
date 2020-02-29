package com.company.training.linear;

//Найдите значение функции  z = ((a - 3) * b / 2) + c

public class Task4 {
	
	public static void main(String[] args) {
		
		double a, b, c, z;
		
		a = 5;
		b = 4;
		c = 2;
		
		double temp1, temp2, temp3;
		
		temp1 = a - 3;
		temp2 = temp1 * b;
		temp3 = temp2 / 2;
		
		z = temp3 + c;
		
		System.out.println("z = " + z);
		
		
		
	}

}
