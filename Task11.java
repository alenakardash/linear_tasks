package com.company.training.linear;

//Вычислить площадь и периметр прямоугольного треугольника по длинам a и b двух катетов

public class Task11 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double perimeter;
		double area;
		
		a = 10;
		b = 5;
		
		double temp1;
		
		temp1 = Math.pow(a, 2) + Math.pow(b, 2);
		
		c = Math.sqrt(temp1);
		
		perimeter = a + b + c;
		
		
		System.out.println("Triangle perimeter is " + perimeter);
		
		
		double temp2;
		
		temp2 = a * b;
		
		
		area = temp2 / 2;
		
		
		System.out.print("Triangle area is " + area);
		
			}
}
