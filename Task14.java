package com.company.training.linear;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса

public class Task14 {
	
	public static void main(String[] args) {
		
		double radius;
		double circumfer;
		double area;
		
		radius = 10;
		
		circumfer = 2 * Math.PI * radius;
		
		
		System.out.println("Circumference is " + circumfer);
		
		
		area = Math.PI * Math.pow(radius, 2);
		
		
		System.out.println("Area of cyrcle is " + area);
		
		
		
	}

}
