/*************************************
*	PostOffice.java
*
*	Programmer: Ben Michener
*	Date: 10/2/16
*	Version: 1.0
*
*	Program Description: This program calculates the price to ship a package
*	based on priority shipping, weight, and whether or not it is going out of state.
**************************************/

import java.util.Scanner;
public class PostOffice
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to PostOffice! This program calculates the cost of postage.");
		System.out.println("Shipping in state is:");
		System.out.println("$5 per pound at priority 1");
		System.out.println("$3 per pound at priority 2");
		System.out.println("$1 per pound at priority 3");
		System.out.println("");
		System.out.println("Out of state shipping is double");

		System.out.println("Will your package be staying in state? (yes or no)");
		String inStateYN = keyboard.nextLine();
		int inStateMod = 0;

		if (inStateYN.equals("yes"))
		{
			inStateMod = 2;
		}
		if (inStateYN.equals ("no"))
		{
			inStateMod = 1;
		}

		System.out.println("Enter the weight in pounds:");
		int weight = keyboard.nextInt();
		System.out.println("Choose a priority. (1, 2, 3):");
		int priority = keyboard.nextInt();

		double price = 0;
		if (priority == 1)
		{
			price = ( inStateMod * weight * 5);
		}
		if (priority == 2)
		{
			price = (inStateMod * weight * 3);
		}
		if (priority == 1)
		{
			price = (inStateMod * weight);
		}

		System.out.println("Thank you.");
		System.out.println("Your package will cost $" + price + " to ship.");
	}
}


