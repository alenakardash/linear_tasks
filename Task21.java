package com.company.training.linear;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа
и вывести полученное значение числа
 */

public class Task21 {
	
	public static void main(String[] args) {
		
		double r;
		
		r = 123.456;
		
		int nnn;
		double ddd;
		
	    nnn = (int) r;
	    
	    ddd = r * 1000 % 1000;
	    
	    double result;
	    
	    result = (double) nnn / 1000 + ddd;
		
		
		System.out.print("result is " + result);
		
		}
}
