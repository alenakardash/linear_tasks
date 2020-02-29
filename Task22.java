package com.company.training.linear;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах по следующей форме HHч ММмин SSс
*/

public class Task22 {
	
	public static void main(String[] args) {
		
		int t;
		
		t = 3800;
		
		int hours;
		
		hours = t / 3600;
		
		int minutes;
		
		minutes = (t / 60) % 60;
		
		int seconds;
		
	    seconds = t - hours * 3600 - minutes * 60;
	    
	    
	    System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
		
		}

}
