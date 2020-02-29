package com.company.training.linear;

//Известна длина окружности. Найти площадь круга, ограниченого этой окружностью.

public class Task20 {
	
	public static void main(String[] args) {
		
		double lenght;
		double radius;
		double area;
		
		lenght = 4;
		
		
		radius = lenght / 2 * Math.PI;
		
		area = Math.PI * Math.pow(radius, 2);
		
		
		System.out.print("Cyrcle area is " + area);
		
		}

}
