package com.company.training.linear;

//Найти площадь треугольника, две стороны котрого равны a и b, а угол между этими сторонами равен y

public class Task26 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double degrees;
		double area;
		
		a =  6;
		b = 10;
		degrees = 45;
		
		double radians;
		double sin;
	
		radians = Math.toRadians(degrees);
		
		sin = Math.sin(radians);
		
		
		area = 0.5 * a * b * sin;
		
		
		System.out.print("Area of triangle is " + area);
		
		
		
	}

}
