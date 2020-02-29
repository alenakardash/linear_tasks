package com.company.training.linear;

//Вычислить расстояние между двумя точками с данными координатами (x1, y1) и (x2, y2)

public class Task12 {
	
	 public static void main(String[] args) {
		 
		 double x1;
		 double x2;
		 double y1;
		 double y2;
		 double temp1;
		 double temp2;
		 double distance;
		 
		 x1 = 10;
		 x2 = 15;
		 y1 = 8;
		 y2 = 11;
		 
		 temp1 = Math.pow((x2 - x1), 2);
		 temp2 = Math.pow((y2 - y1), 2);
		 
		 distance = Math.sqrt(temp1 + temp2);
		 
		 System.out.println("Distance between the dots is " + distance);
		 
	 }

}
