package com.company.training.linear;

/* 
Написать  код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
бидонах, если в каждом большом бидоне на 12 л молока больше, чем в малом.
*/

public class Task6 {
	
	public static void main(String[] args) {
		
		int n;
		int m;
		
		n = 10;
		m = 7;
		
		double totalVolSmallCans;
		double totalVolBigCans;
		
		totalVolSmallCans = 80;
		
		double smallCanVol;
		double bigCanVol;
		
		smallCanVol = totalVolSmallCans / n;
		bigCanVol = smallCanVol + 12;
		
		
		totalVolBigCans = bigCanVol * m;

		
		
		System.out.print("There are " + totalVolBigCans + " liters of milk in " + m + " cans");
		
		
	}

}
