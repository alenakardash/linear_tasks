package com.company.training.linear;

public class Taslk37 {
	
/* Составить линейную программу, печатающую значение true, если указанное 
высказывание является истинным, и false — в противном случае:
 */
	
	public static void main(String[] args) {
		
		boolean result;
		
// целое число N является двузначным четным числом
		
		int n;
		
		n = 9;
		
		
		if ((n % 2 == 0) && (n >= 10) && (n <= 99)) {
			
			result = true;
		}
		
		else {
			
			result = false;
		}
		
		
		System.out.println(result);
		

// сумма двух первых цифр заданного четырехзначного числа равно сумме двух его последних цифр
		
		int x;
		
		x = 2882;
		
		
		boolean answer;
		
		int a, b, c, d;
		
		
		a = x % 10;
		
		x /= 10;
		
		b = x % 10;
		
		x /= 10;
		
        c = x % 10;
		
		x /= 10;
		
        d = x % 10;
        
		
		if ((a + b) == (c + d)) {
			
			answer = true;
		}
		
		else {
			
			answer = false;
		}
		

		System.out.println(answer);
		
		
// Сумма цифр данного трехзначного числа N является четным числом
		
		int newn;
		
		newn = 123;
		
		
		int e, f, g;
		
		boolean chet;
		
		
		e = newn % 10;
		
		newn /= 10;
		
		f = newn % 10;
		
		newn /= 10;
		
		g = newn % 10;
		
       
		int sum;
		
		sum = e + f + g;
		
		
		if (sum % 2 == 0) {
			
		chet = true;
			
		}
		
		else {
			
			chet = false;
		}
		
		
		System.out.println(chet);
		
		
// Точка с координатами (x, y) принадлежит части плоскости, лежащей между прямымм x = m и x = n (m < n )	
		
	    int varX;
	    int varM;
	    int varN;
	    
	    varX = 10;
	    varM = 2;
	    varN = 12;
	    
	    boolean ifBelongTo;
	    
	    if ((varX >= varM) && (varX <= varN)) {
	    	
	    	ifBelongTo = true;
	    }
	    
	    else {
	    	
	    	ifBelongTo = false;
	    }
	    
	    
	    System.out.println(ifBelongTo);
	    
		
//  Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
		
		
		double initialNum;
		double num1;
		
		
		
		initialNum = 789;
		
		num1 = initialNum;
		
		
		int k, l, m;
		
		
		k = (int) num1 % 10;
		
		num1 /= 10;
		
		l = (int) num1 % 10;
		
		num1 /= 10;
		
		m = (int) num1 % 10;
		
		
		double temp1, temp2, temp3;
		
		
		temp1 = Math.pow(initialNum, 2);
		
		temp2 = (double) (k + l + m);
		
		temp3 = Math.pow(temp2, 3);
		
		
		boolean bool;
		
		
		if (temp1 == temp3) {
			
			bool = true;
			
			}
		else {
			
			bool = false;
		}
		
		
		System.out.println(bool);
		
		
// Треугольник со сторонами a, b, c является равнобедренным
		
		
		int sideA;
		int sideB;
		int sideC;
		
		sideA = 20;
		sideB = 20;
		sideC = 3;
		
		
		boolean ifIsosceles;
		
		if ((sideA == sideB) | (sideA == sideC) | (sideB == sideC)) {
			
			ifIsosceles = true;
		}
		
		else {
			
			ifIsosceles = false;
		}
		
		
		System.out.println(ifIsosceles);
		
		
// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		
		
		int numb;
		
		numb = 313;
		
		
		int v, w, u;
		boolean ifEqual;
		
		
		v = numb % 10;
		
		numb /= 10;
		
		w = numb % 10;
		
		numb /= 10;
		
		u = numb % 10;
		
		
		if (((v + w) == u) || ((v + u) == w) || ((u + w) == v)) {
			
			ifEqual = true;
		}
		
		else {
			
			ifEqual = false;
		}
		
		
	    System.out.println(ifEqual); 
	    
	    
 // Заданное число N является степенью числа a (показатель степени может находится в диапазоне от 0 до 4 )	
	
	   double nNum;
	   
	   nNum = 4;
	   
	   double aNum;
	   
	   aNum = 2;
	   
	   boolean ifEq;
	   
	   double var1, var2, var3;
	   
	   
       var1 = Math.pow(aNum, 2);
	   
	   var2 = Math.pow(aNum, 3);
	   
	   var3 = Math.pow(aNum, 4);
	   
	   
	   if (nNum == 1 | nNum == aNum | nNum == var1 | nNum == var2 | nNum == var3) {
		 
		   ifEq = true;
		   
	   }
	   
	   else {
		   
		   ifEq = false;
		   
		   }
	   
	   
	   System.out.println(ifEq);
	   
	    
//График функции у = ахx + bх + с проходит через заданную точку с координатами (m, п).
	   
	int aVar, bVar, cVar;
	
	aVar = 1;
	bVar = 2;
	cVar = 2;
	
	int coordM, coordN;
	
	coordM = 2;
    coordN = 10;
	
	boolean ifBelong;
	
	
	// Упрощаем выражение до y = x (ax + b) + c
	
	
	int tempVar;
	
	tempVar = aVar * coordM + bVar;
	
	tempVar *= coordM;
	
	tempVar += cVar;
	
	
	if(coordN == tempVar) {
		
		ifBelong = true;
	}
	
	else {
		
		ifBelong = false;
	}
	
	System.out.println(ifBelong);
	   
	}

}
