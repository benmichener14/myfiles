/********************************
*	ParkingGarage
*
*	Programmer: Ben Michener
*	Date: 10/2/16
*	Version: 1.0
*
*	Program Description: This program calculates the price for parking
*	in a parking garage, taking into account the minimum price of $10,
*	the price of $5 for ever 4 hours after, and the pricce of $5 for an attendant.
********************************/

import java.util.Scanner;
public class ParkingGarage
{
public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Welcome to the Parking Garage");
	System.out.println("For how many hours will you park?");

	int hours = keyboard.nextInt();

	while (hours % 4 != 0)
	{
		hours += 1;
	}

	System.out.println("Alright. We'll charge you for " + hours + " hours.");
	System.out.println("Would you like your car detailed? (yes or no)");

	keyboard.nextLine();
	int detail = 0;
	if (keyboard.nextLine().equals("yes"))
	{
		detail = 5;
		System.out.println("Smart choice.");
	}
	if (keyboard.nextLine().equals("no"))
	{
		detail = 0;
		System.out.println("Your loss.");
	}

	double price = (10 + 5 * ((hours - 4) / 4) + detail);
	System.out.println("Parking will cost you $" + price);
	}
}