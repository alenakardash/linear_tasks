package com.company.training.linear;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Task18 {
	
	public static void main(String[] args) {
		
		double a;
		
		a = 5;
		
		double oneFaceArea;
		double totalFaceArea;
		double volume;
		
		oneFaceArea = Math.pow(a, 2);
		
		totalFaceArea = 6 * oneFaceArea;
				
		volume = Math.pow(a, 3);
		
		
		System.out.println("Area of one cube face is " + oneFaceArea);
		
		System.out.println("Total area of the cube is " + totalFaceArea);
		
		System.out.println("Volume of the cube is " + volume);
		
		
		}

}
