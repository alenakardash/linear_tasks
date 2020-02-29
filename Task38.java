package com.company.training.linear;

public class Task38 {
	
/* Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной 
области, и false — в противном случае:
*/
	
	// Задача про треугольники
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		int temp1;
		int temp2;
		
		x = 3;
		y = 3;
				
		boolean ifFit;
		
		
/* Определим координаты точек, образующие прямые (гипотенузы треугольников)
 
 A1 (0, 4), B1 (4, 0) координаты двух точек гипотенузы правого треугольника
 А2 (0, 4), B2 (-4, 0) координаты двух точек гипотенузы левого треугольника
 
 Используя формулу y = kx + b рассчитаем формулы прямых для гипотенуз треугольников
 
 x + y - 4 = 0  - формула гипотенузы правого треугольника
 
 y - x - 4 = 0 - формула гипотенузы левого треугольника
 
 */
		
		temp1 = x + y - 4;
		
		temp2 = y - x - 4;
		
		if (x >= 0 && temp1 <= 0 && temp2 <= 0) {
			
			ifFit = true;
		}
		
		else {
			
			ifFit = false;
		}
		
		System.out.println(ifFit);
		
// Задача про прямоугольники
		
		
		int varX;
		int varY;
		
		varX = 3;
		varY = 1;
		
		boolean ifFitRectUp;
		boolean ifFitRectDown;
		
		if (varY >=0 && varY <= 4 && varX >= -2 && varX <= 2) {
			
			ifFitRectUp = true;
		}
		
		else {
			
			ifFitRectUp = false;
			
		}
		
		if (varY <= 0 && varY >= -3 && varX >= -4 && varX <= 4) {
			
			ifFitRectDown = true;
			
		}
		
		else {
			
			ifFitRectDown = false;
			
		}
		
		boolean result;
		
		if (ifFitRectUp | ifFitRectDown) {
			
			result = true;
		}
		
		else {
			
			result = false;
		}
		
		System.out.println(result);
		
		
// Задача про 1/4 кругов
		
		double r1;
		double r2;
		
		r1 = 4;
		r2 = 5;
		
		boolean ifFitRoundUp;
		boolean ifFitRoundDown;
		
		double x1;
		double y1;
		
		x1 = -1;
		y1 = -4;
		
// Найдем расстояние z от центра круга до точки (гипотенуза треугольника)
		
		
		double z;
		
		z = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		
		
		if (r1 >= z && x1 >= 0 && y1 >= 0) {
			
			ifFitRoundUp = true;
			
		}
		else {
			
			ifFitRoundUp = false;
			
		}
		
		if (r2 >= z && x1 >= 0 && y1 <= 0) {
			
			ifFitRoundDown = true;
			
		}
		
		else {
			
			ifFitRoundDown = false;
			
		}
		
		boolean fitToRounds;
		
		if (ifFitRoundUp | ifFitRoundDown) {
			
			fitToRounds = true;
			
		}
		
		else {
			
			fitToRounds = false;
		}
		
		System.out.println(fitToRounds);
		
		}

}
