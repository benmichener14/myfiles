/****************************
*	ChangeMaker.java
*
*	Programmer: Ben Michener
*	Date: 9/28/16
*	Version: 1.0
*
*	Program Description: This program asks for a number of cents,
*	then determines the number of each bill and coin that the base
*	number of cents can be broken into.
*****************************/

import java.util.Scanner;
public class ChangeMaker
	{
	public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Welcome to Change Maker. This program converts cents to standard monetary denominations.");
			System.out.println("How many cents do you want me to convert?");

			int cents = keyboard.nextInt();
			int hundred = 0;
			int fifty = 0;
			int twenty = 0;
			int ten = 0;
			int five = 0;
			int one = 0;
			int half = 0;
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;

			while ((cents - 10000) >= 0)
				{
					hundred += 1;
					cents -= 10000;
				}
			while ((cents - 5000)>= 0)
				{
					fifty += 1;
					cents -= 5000;
				}
			while ((cents - 2000)>= 0)
				{
					twenty += 1;
					cents -= 2000;
				}
			while ((cents - 1000)>= 0)
				{
					ten += 1;
					cents -= 1000;
				}
			while ((cents - 500)>= 0)
				{
					five += 1;
					cents -= 500;
				}
			while ((cents - 100)>= 0)
				{
					one += 1;
					cents -= 100;
				}
			while ((cents - 50) >= 0)
				{
					half += 1;
					cents -= 50;
				}
			while ((cents - 25) >= 0)
				{
					quarter += 1;
					cents -= 25;
				}
			while ((cents - 10) >= 0)
				{
					dime += 1;
					cents -= 10;
				}
			while ((cents - 5) >= 0)
				{
					nickel += 1;
					cents -= 5;
				}
			while ((cents - 1) >= 0)
				{
					penny += 1;
					cents -= 1;
				}

			System.out.println("The total number of bills and coins is:");
			System.out.println(hundred + " Hundred Dollar Bills");
			System.out.println(fifty + " Fifty Dollar Bills");
			System.out.println(twenty + " Twenty Dollar Bills");
			System.out.println(ten + " Ten Dollar Bills");
			System.out.println(five + " Five Dollar Bills");
			System.out.println(one + " One Dollar Bills");
			System.out.println(half + " Half Dollars");
			System.out.println(quarter + " Quarters");
			System.out.println(dime + " Dimes");
			System.out.println(nickel + " Nickels");
			System.out.println(penny + " Pennies");

	}
}