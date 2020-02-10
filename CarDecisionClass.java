package carDecisionProject;

import java.util.Scanner;

public class CarDecisionClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the cost of the regular car : ");
		double regCar = in.nextDouble(); 
		System.out.println("Enter the miles per gallon of the regular car : ");
		double mpgReg = in.nextDouble();
		System.out.println("Enter the cost of the hybrid car : ");
		double hybridCar = in.nextDouble();
		System.out.println("Enter the miles per gallon of the hybrid car : ");
		double mpgHybrid = in.nextDouble();
		System.out.println("Enter the cost of gas : ");
		double gasCost = in.nextDouble();
		System.out.println("Enter the number of miles traveled in one year : ");
		double milesTraveled = in.nextDouble();
		double hybridCost = hybridCar + (milesTraveled/mpgHybrid) * (gasCost); 
		double carCost = regCar + (milesTraveled/mpgHybrid) * (gasCost); 
		int year = 1;
		
	for (int a=0; a<5; a++)
	{	
		if (hybridCost < carCost) {
			System.out.println("The cost after " + year + ( " years is Regular Car:" + carCost + (". Hybrid Car" + hybridCost)));
			System.out.println("The car pays back after " + year + " years");
		}
		else 
		{
			System.out.println("The cost after " + year + (" years is Regular Car:" + carCost + (". Hybrid Car: " + hybridCost)));
			System.out.println("The hybrid car pays back after " + year + " years");
		}
	
	}	
		
		
	}

}
