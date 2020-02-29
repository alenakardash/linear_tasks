package com.company.training.linear;

//Заданы координаты трех вершин треугольника (x1, y1), (x2, y2), (x3, y3). Найти его периметр и площадь

public class Task13 {
	
	 public static void main(String[] args) {
		 
		 double x1;
		 double x2;
		 double x3;
		 double y1;
		 double y2;
		 double y3;
		 
		 x1 = 2;
		 x2 = 5;
		 x3 = 13;
		 y1 = 1;
		 y2 = 8;
		 y3 = 12;
		 
		 
		 double perimeter;
		 double area;
		 
		 double ab;
		 double bc;
		 double ac;
		 
		 double temp1;
		 double temp2;
		 double temp3;
		 
		 
		 temp1 = (x2 - x1) + (y2 - y1);
		 
		 ab = Math.sqrt(temp1);
		 
		 
		 temp2 = (x3 - x2) + (y3 - y2);
		 
		 bc = Math.sqrt(temp2);
		 
		 
		 temp3 = (x3 - x1) + (y3 - y1);
		 
		 ac = Math.sqrt(temp3);
		 
		 
		 perimeter = ab + bc + ac;
		 
		 System.out.println("Triangle perimeter is " + perimeter + "cm");
		 
         
		 double semiperimeter;
		 
		 semiperimeter = perimeter / 2;
		 
		 
		 double temp4;
		 double temp5;
		 double temp6;
		 
		 
		 temp4 = semiperimeter - ab;
		 
		 temp5 = semiperimeter - bc;
		 
		 temp6 = semiperimeter - ac;
		 
		 
		 area = Math.sqrt(semiperimeter * temp4 * temp5 * temp6);
		 
		 
		 System.out.println("Triangle area is " + area + " square cm");
		 
		 }

}
