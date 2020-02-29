package com.company.training.linear;

//Дана стророна равностороннего треугольника. Найти его площадь, высоту, радиусы вписанной и описанной окружности.

public class Task19 {
	
	public static void main(String[] args) {
		
		double x;
		
		x = 10;
		
		double area;
		
		area = (Math.sqrt(3) * Math.pow(x, 2)) / 4;
		
		System.out.println("Triangle area is " + area);
		
		double height;
		double temp;
		
		temp = Math.sqrt(3) * x;
		
		height = (temp) / 2;
		
		
		System.out.println("Triangle height is " + height);
		
		
		double inscrRadius;
		
		inscrRadius = temp / 6;
		
		
		System.out.println("Inscribed radius of triangle is " + inscrRadius);
		
		
		double circRadius;
		
		circRadius = temp / 3;
		
		
		System.out.println("Circumscribed radius of triangle is " + circRadius);
		
		
	}

}
