package com.company.training.linear;

/*  Текущее показание электронных часов m (0 <= m <= 23) n минут (0 <= n <= 59) k c (0 <= k <= 59). Какое время
будут показывать часы через p часов, q минут, r секунд
*/

public class Task32 {
	
	public static void main(String[] args) {
		
		int m = 0;
		int n = 23;
		int k = 59;
		
		int currentHours;
		int currentMinutes;
		int currentSeconds;
		
		int p, q, r;
		
		p = 3;
		q = 20;
		r = 1;
				
		
		if ((m + p) > 24) {
			
			currentHours = (m + p) - 24;
		}
		
		else if ((m + p) == 24)  {
			
			currentHours = 0;
			
		}
		
		else {
			
			currentHours = m + p;
			
		}
		
		if ((n + q) > 60) {
			
			currentMinutes = (n + q) - 60;
			
			currentHours++;
		}
		
		else if ((n + q) == 60) {
			
			currentMinutes = 0;
			
			currentHours++;
			
		}
		
		else {
			
			currentMinutes = n + q;
		}
		
		
		if ((k + r) > 60) {
			
			currentSeconds = (k + r) - 60;
			
			currentMinutes++;
			
		}
		
		else if ((k + r) == 60) {
			
			currentSeconds = 0;
			
			currentMinutes++;
			
		}
		
		else {
			
			currentSeconds = k + r;
			
		}
		
		if (currentSeconds == 60) {
			
			currentSeconds = 0;
			
			currentMinutes++;
		}
		
		else {}
		
		if (currentMinutes == 60) {
			
			currentMinutes = 0;
			
			currentHours++;
			
		}
		
		else {}
		
       if (currentHours == 24) {
			
			currentHours = 0;
		}
	
       else {}
       
       
       System.out.println("Current time is " + currentHours + " h " + currentMinutes + " min " + currentSeconds + " sec ");
		
	}
	


}
