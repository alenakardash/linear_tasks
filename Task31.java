package com.company.training.linear;

/* Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/час, скорость течения реки
v1 км/час, время движения по озеру t1 час, а против течения реки t2 час.
*/

public class Task31 {
	
 public static void main(String[] args) {
	
	double boatSpeed;
	double riverSpeed;
	double timeAlongFlow;
	double timeAgainstFlow;
	
	boatSpeed = 15;
	riverSpeed = 4;
	timeAlongFlow = 3;
	timeAgainstFlow = 1;
	
	double distanceAlongFlow;
	double distanceAgainstFlow;
	
	
	distanceAlongFlow = (boatSpeed + riverSpeed) * timeAlongFlow;
	
	distanceAgainstFlow = (boatSpeed + riverSpeed) * timeAgainstFlow;
	
	
	double dintance;
	
	dintance = distanceAlongFlow + distanceAgainstFlow;
	
	
	System.out.print("Distance is " + dintance + " km");
	
}

}
