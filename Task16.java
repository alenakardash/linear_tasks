package com.company.training.linear;

//Найти произведение цифр заданного четырехзначного числа

public class Task16 {
	
	public static void main(String[] args) {
		
      int x;
      
      x = 1234;
      
      int a;
      int b;
      int c;
      int d;
      
      int result;
      
      
      a = x / 1000;
      
      b = x % 1000 / 100;
      
      c = x % 100 / 10;
      
      d = x % 10;
      
      result = a * b * c * d;
      
      
      System.out.print(result);
      
			
		}
	}
