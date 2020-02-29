package com.company.training.linear;

/* Вычислить значение выражения по формуле (все числа принимают действительные значения)

sin x + cos y 
______________ * tg xy

cos x - sin y

*/

public class Task10 {

	public static void main(String[] args) {
		
		double x, y, result;
		
		x = 1.5759595924987;

		y = 0.52876204130212;
		
		double arg1, arg2;
		
		double dividend, divisor, temp;
		
		
		dividend = Math.sin(x) + Math.cos(y);
		
		divisor = Math.cos(x) - Math.sin(y);
		
		arg1 = dividend / divisor;
		
		temp = x * y;
		
		arg2 = Math.tan(temp);
		
		result = arg1 * arg2;
		
		
		System.out.print("Result is " + result);
		
		
	}
}
