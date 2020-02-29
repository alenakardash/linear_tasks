package com.company.training.linear;

//Дано значение х. Получить значения -2х + 3x² - 4x³ и 1 + 2х + 3x² + 4x³ . Позаботьтесь об экономии операций.

public class Task40 {
	
	public static void main(String[] args) {
		
// Упрощаем первое выражение до x( x(3 - 4x) - 2)
		
		int x;
		int temp;
		int arg1;
		int result1;
		
		x = 2;
		
		temp = 3 - 4 * x;
		
		temp *= x;
		
		arg1 = temp - 2;
		
		result1 = x * arg1;
		
		
		System.out.println("Result of the first expression is " + result1);
		
		
// Упрощаем второе выражение до y(2 + y(3 + 4y)) + 1
		
		int y;
		int tempor;
		int arg;
		int result2;
		
		y = 2;
		
		tempor = 3 + 4 * y;
		
		tempor *= y;
		
		tempor += 2;
		
		arg = y * tempor;
		
		result2 = arg + 1;
		
		
		System.out.println("Result of the second expression is " + result2);
	
		
	}

}
