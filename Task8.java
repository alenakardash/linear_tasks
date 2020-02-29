package com.company.training.linear;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения)

         b + √(b² + 4ac)
		________________ _ a³c + b-²
               2a
*/

public class Task8 {
	
 public static void main(String[] args) {
	 
	 double a, b, c;
	 
	 a = 1;
	 b = 4;
	 c = 2;
	 
	 double arg1, arg2, arg3;
	 double dividend, divisor;
	 double temp1, temp2;
	 double result;
	 
	 
	 temp1 = Math.pow(b, 2) + 4 * a * c;
	 
	 dividend = b + Math.sqrt(temp1);
	 
	 divisor = 2 * a;
	 
	 arg1 = dividend / divisor;
	 
	 temp2 = Math.pow(a, 3);
	 
	 arg2 = temp2 * c;
	 
	 arg3 = Math.pow(b, -2);
	 
	 result = arg1 + arg2 + arg3;
	 
	 
	 System.out.print("Result is " + result);
	 
	 }
	
}
