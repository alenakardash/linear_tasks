package com.company.training.linear;

/*
Вычислить значение выражения по формуле (все числа принимают действительные значения)

a    b     ab - c
–  * –  -  _______
b    d        cd
*/

public class Task9 {
	
	 public static void main(String[] args) {
		 
		 double a, b, c, d, result;
		 
		 a = 1;
		 b = 2;
		 c = 3;
		 d = 4;
		 
		 double arg1, arg2;
		 double temp1, temp2;
		 double dividend, divisor;
		 
		 temp1 = a * b;
		 temp2 = b * c;
		 
		 arg1 = temp1 / temp2;
		 
		 dividend = temp1 - c;
		 
		 divisor = c * d;
		 
		 arg2 = dividend / divisor;
		  
		 result = arg1 - arg2;
		 
		 
		System.out.print("Result is " + result); 
		 
		 
		 
	 }

}
