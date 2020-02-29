package com.company.training.linear;

//Найдите значение функции z = 2 * x + (y - 2) * 5

public class Task3 {
	
	public static void main(String[] args) {
	
	 int z;
	 int x;
	 int y;
	
	 x = 1;
	 y = 3;
	
	 int arg1;
	 int temp;
	 int arg2;
	
	 arg1 = 2 * x;
	 
	 temp = y - 2;
	 
	 arg2 = temp * 5;
	
	 z = arg1 + arg2;
	
	 System.out.println("Result is " + z);
	
	}

}
