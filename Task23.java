package com.company.training.linear;

//Найти площадь кольца, внешний радиус которого равен r, а внешний - R (R > r).

public class Task23 {
	
     public static void main(String[] args) {
		
		double smallCyrcleRad;
		double bigCycleRad;
		
		smallCyrcleRad = 3;
		bigCycleRad = 7;
		
		double smallCyrcleArea;
		double bigCyrcleArea;
		
		smallCyrcleArea = Math.PI * Math.pow(smallCyrcleRad, 2);
		
		bigCyrcleArea = Math.PI * Math.pow(bigCycleRad, 2);
		
		
		double ringArea;
		
		ringArea = bigCyrcleArea - smallCyrcleArea;
		
		
		System.out.println("Area of the ring is " + ringArea);
		
		}
	

}
