package com.company.training.linear;

//Найти площадь равнобедренной трапеции с основанием a и b и углои a при большем основании a

public class Task24 {
	
	public static void main (String[] args) {
		
		double a;
		double b;
		double degrees;
		
		
		a = 10;
		b = 7;
		degrees = 60;
		
		
		double radians;
		double arg1;
		double arg2;
		double area;
		
		
		arg1 = a * b;

		radians = Math.toRadians(degrees);
	    
	    arg2 = Math.sin(radians);
	    
	    area = arg1 / arg2;
	    
	    
	    System.out.print("Trapezoid area is " + area);
		
		}

}
