package com.company.training.linear;

//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измеоения информации

public class Task34 {
	
    public static void main(String[] args) {
		
		double bytes;
		double kBytes;
		double mBytes;
		double gBytes;
		double tBytes;
		
		bytes = 2048;
		
		kBytes = bytes / 1024;
		
		mBytes = kBytes / 1024;
		
		gBytes = mBytes / 1024;
		
		tBytes = gBytes / 1024;
		
		
		System.out.println(bytes + "  - " + kBytes + " Кb");
		
		System.out.println(bytes + "  - " + mBytes + " Mb");
		
		System.out.println(bytes + "  - " + gBytes + " Gb");
		
		System.out.println(bytes + "  - " + tBytes + " Tb");
		
	}

}
