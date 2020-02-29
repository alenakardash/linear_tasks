package com.company.training.linear;

/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
2x⁴-3x³+4x² -5х+6.
*/

public class Task39 {
	
	public static void main(String[] args) {

	int x = 2;
	
	// Упрощенное выражение x(x(x(2x - 3) + 4) -5) + 6
	
	int temp;
	int arg1;
	int result;
	
	temp = x * (2 * x - 3);
	
	temp += 4;
	
	temp = x * temp - 5;
	
	arg1 = x * temp;
	
	result = arg1 + 6;
	
	
	System.out.print(result);
	
	}	
}
