package com.company.training.linear;

//Найти частное произведений четных и нечетных цифр четырехзначного числа

public class Task36 {
	
	 public static void main(String[] args) {
		 
		 int number;
		 
		 number = 1234;
		 
		 int a, b, c, d;
		 
		 
		 d = number % 10;
		 
		 number /= 10;
		 
		 c = number % 10;
		 
		 number /= 10;
		 
		 b = number % 10;
		 
		 number /= 10;
		 
		 a = number % 10;
		 
		 int chet;
		 int nechet;
		 
		 chet = 1;
		 nechet = 1;
		 
		 
         if ((a % 2) == 0) {
        	 
        	 chet *= a;
         }
         
         else {
        	 
        	 nechet *= a;
         }
         
         if ((b % 2) == 0) {
        	 
        	 chet *= b;
         }
         
         else {
        	 
        	 nechet *= b;
         }
         
         if ((c % 2) == 0) {
        	 
        	 chet *= c;
         }
         
         else {
        	 
        	 nechet *= c;
         }
         
         if ((d % 2) == 0) {
        	 
        	 chet *= d;
         }
         
         else {
        	 
        	 nechet *= d;
         }
         
         double result;
         
         result = (double) chet / nechet;
         
         
         System.out.print("Частное произведений четных и нечетных цифр = " + result);

		 
	 }

}
