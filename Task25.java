package com.company.training.linear;

/* Вычислить корни квадратного уравнения ax² + bx + c = 0 с заданными коэффициентами a, b, c (предполагается, что a не равно 0,
а дискриминант неотрицателен
*/

public class Task25 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = 1;
		b = 10;
		c = -75;
		
		double discr;
		double x1;
		double x2;
		
		
		discr = Math.pow(b, 2) - 4 * a * c;
		
		double dividend1;
		double dividend2;
		double divisor;
		
		dividend1 = - b + Math.sqrt(discr);
		
		dividend2 = - b - Math.sqrt(discr);
		
		divisor = 2 * a;
		
		x1 = dividend1 / divisor;
		
		x2 = dividend2 / divisor;
		
		
		System.out.println("x1 = " + x1);
		
		System.out.print("x2 = " + x2);
		
		}

}
