package com.company.training.linear;

//Составить программу перевода радианной меры углов в градусы, минуты и секунды

public class Task28 {
	
	public static void main(String[] args) {
		
		double radians;
		double totalDegrees;
		double totalMinutes;
		double totalSeconds;
		
		radians = 0.62;
		
		// Конвертер для перевода радиан только в градусы, только в минуты и только в секунды
		
		
		totalDegrees = (radians * 180) / Math.PI;
		
		
		System.out.println(radians + " radians is equal to " + totalDegrees + " degrees");
		
		
		totalMinutes = totalDegrees * 60;
		
		
		System.out.println(radians + " radians is equal to " + totalMinutes + " minutes");
		
		
		totalSeconds = totalDegrees * 3600;
		
		
		System.out.println(radians + " radians is equal to " + totalSeconds + " seconds");
		
		
		// Вычислим количество градусов, минут и секунд в заданном количестве радиан
		
		
		double degrees;
		
		degrees = (int) (totalDegrees);
		
		double secondsInDegrees;
		
		secondsInDegrees = degrees * 3600;
		
		double seconds;
		
		seconds = totalSeconds - secondsInDegrees;
		
		double minutes;
		
		minutes = (int) (seconds/ 60);
		
		double leftSeconds;
		
		leftSeconds = (int) (seconds - minutes * 60);
		
		
		System.out.println(radians + " радиан равно " + degrees + " градусов " + minutes + " минут " + leftSeconds + " секунд");
		
		
	}

}
