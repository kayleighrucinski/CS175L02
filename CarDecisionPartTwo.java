package carDecisionPartTwo;

import java.util.Scanner;

public class CarDecisionPartTwo {

			public static void main(String[] args) {

				Scanner scan = new Scanner(System.in);
//car one 
				System.out.println("Enter the the Car make and Model, Cost to Purchase, and MPG of the first car"
				+ "in that order seperated by commmas");
				String firstCar = scan.nextLine();
				String str = firstCar;
				String[] arrOfFirstCar = str.split(",", 3);

				String firstCarName = arrOfFirstCar[0];
				double firstCarCost = Double.parseDouble(arrOfFirstCar[1].trim());
				double firstCarMPG = Double.parseDouble(arrOfFirstCar[2].trim());
//car two 

				System.out.println("Enter the the Car make and Model, Cost to Purchase, and MPG of the Second car"
				+ "in that order seperated by commmas");
				String secondCar = scan.nextLine();
				String str2 = secondCar;
				String[] arrOfSecondCar = str2.split(",", 3);

				String secondCarMM = arrOfSecondCar[0];

				double secondCarCost = Double.parseDouble(arrOfSecondCar[1].trim());
				double secondCarMPG = Double.parseDouble(arrOfSecondCar[2].trim());
				
				
				System.out.println("Enter how many miles traveled in a year");
				double milesTraveled = scan.nextDouble();
				System.out.println("Enter cost of gas");
				double gasCost = scan.nextDouble();

				double firstCarTotal = firstCarCost + (milesTraveled / firstCarMPG) * (gasCost);
				double secondCarTotal = secondCarCost + (milesTraveled / secondCarMPG) * (gasCost);
				int year = 1;

				for (int x = 0; x < 5; x++) {
				if (secondCarTotal < firstCarTotal) {
				System.out.println("The cost after " + year + (" years is : " + firstCarName + " " + firstCarTotal
				+ (". " + secondCarMM + " " + secondCarTotal)));
				System.out.println("The " + secondCarMM + " pays back after " + year + " years");

				} else {
				System.out.println("The cost after " + year + (" years is : " + firstCarName + " " + firstCarTotal
				+ (". " + secondCarMM + " " + secondCarTotal)));
				year++;
				firstCarTotal = firstCarTotal + (milesTraveled / firstCarMPG) * (gasCost);
				secondCarTotal = secondCarTotal + (milesTraveled / secondCarMPG) * (gasCost);



				}
			
			}	
				
				
			}
				
			}

		
