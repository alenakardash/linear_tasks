package com.company.training.linear;

//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы

public class Task33 {
	
	public static void main(String[] args) {
		
		char b;
		b = '$';
		
		int codeB = (int) b;
		
		int codeA;
		int codeC;
		
		codeA = codeB - 1;
		
		codeC = codeB + 1;
		
		char a;
		char c;
		
		a = (char) codeA;
		 
		c = (char) codeC; 
		
		
		System.out.println("Порядковый номер " + b + " - " + codeB);
		
		System.out.println("Предыдущий от " + b + " символ - " + a);
		
		System.out.println("Следующий после " + b + " символ - " + c);
		
		
	}

}
