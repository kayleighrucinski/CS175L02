package HousePaintingCode;

import java.util.Scanner;

public class housePainting {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter the Lenght of the house: ");
		int houseLenght = scan.nextInt(); 
		System.out.print("Enter the Height of the house: ");
		int houseHeight = scan.nextInt(); 
		System.out.print("Enter the Width of the house: ");
		int houseWidth = scan.nextInt(); 
		System.out.print("Enter the cost of the painter: ");
		int painterCost = scan.nextInt(); 
		System.out.print("Enter # of Windows ");
		int numberWindows = scan.nextInt();
		System.out.print("Enter the Length of Windows ");
		int lenghtWindows = scan.nextInt();
		System.out.print("Enter the Height of Windows: ");
		int heightWindows= scan.nextInt();
		System.out.print("Enter the # of Doors ");
		int numberDoors = scan.nextInt();
		System.out.print("Enter the lenght of Doors: ");
		int lenghtDoor = scan.nextInt();
		System.out.print("Enter the height of the Doors ");
		int heightDoor = scan.nextInt();
		int houseSqFt= houseLenght * houseWidth; 
		int doorDimensions = heightDoor * lenghtDoor* numberDoors; 
		int windowDimensions = lenghtWindows * heightWindows * numberWindows; 
		double peakSqft = ((.5*(houseLenght*(houseHeight-houseWidth)))+ houseSqFt)*2;
		double totalsqft = 2*(houseSqFt)+ (peakSqft); 
		double actualSqft = totalsqft - windowDimensions - doorDimensions;
		double total = painterCost * actualSqft; 
		System.out.println("The total cost is: "+ total);

		System.out.println("The total square foot to paint is "+ actualSqft); 
		System.out.println("The square footage is: "+ totalsqft); 



	}

}
