package com.company.training.linear;

//Найти  (в радианах и  градусах) все углы треугольника со сторонами a, b, c.

public class Task29 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = 10;
		b = 10;
		c = 15;
		
		double squaredA;
		double squaredB;
		double squaredC;
		
		squaredA = Math.pow(a, 2);
		
		squaredB = Math.pow(b, 2);
		
		squaredC = Math.pow(c, 2);
		
		double areaARad;
		double areaBRad;
		double areaYRad;
		
		
		areaARad = Math.acos((squaredA + squaredC - squaredB) / (2 * a * c));
		
		areaBRad = Math.acos((squaredA + squaredB - squaredC) / (2 * a * b));
		
        double areaADegr;
        double areaBDegr;
        double areaYDegr;
        
        areaADegr = Math.toDegrees(areaARad);
        
        areaBDegr = Math.toDegrees(areaBRad);
        
        areaYDegr = 180 - (areaADegr + areaBDegr);
        
        areaYRad = Math.toRadians(areaYDegr);
        
        
        System.out.println("Угол A равен " + areaADegr + " градусов или " + areaARad + " радиан");
        
        System.out.println("Угол B равен " + areaBDegr + " градусов или " + areaBRad + " радиан");
        
        System.out.println("Угол C равен " + areaYDegr + " градусов или " + areaYRad + " радиан");
		
	}

}
