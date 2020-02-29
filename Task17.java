package com.company.training.linear;

//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class Task17 {
	
	public static void main(String[] args) {
	
	double a;
	double b;
	
	a = 10;
	b = 20;
	
	double temp1;
	double temp2;
	
	temp1 = Math.pow(a, 3);
	
	temp2 = Math.pow(b, 3);
	
	
	double arifmAverage;
	
	arifmAverage = (temp1 + temp2) / 2;
	
	
	System.out.println("Arifmetic average value is " + arifmAverage);
	
	
	double geomAverage;
	double temp3;
	
	temp3 = Math.abs(a) * Math.abs(b);
	
	geomAverage = Math.sqrt(temp3);
	
	
	System.out.print("Geometric average value is " + geomAverage);
	
	}

}
