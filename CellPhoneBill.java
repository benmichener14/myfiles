/********************************
*	CellPhoneBill
*
*	Programmer: Ben Michener
*	Date: 10/13/16
*	Version: 1.0
*
*	Program Description: This program calculates the price a person
*	pays for their monthly cell phone bill, starting with a base cost of $49.99
*	that includes 400 minutes, with an extra $0.10 and $0.50 cost per minute on
*	nighttime and daytime minutes, respectively. The program also calculates a connection
*	fee of $0.03 per minute (of the minutes used), a tax of 5%, and the total cost.
********************************/

import java.util.Scanner;
public class CellPhoneBill
{
public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int dayMinutes = 0;
		int nightMinutes = 0;
		int totalMinutes = 0;
		double addMinuteCost = 0;
		double connectionFee = 0;
		double totalCost = 0;

		System.out.println("How many daytime minutes did you use?");
		dayMinutes = keyboard.nextInt();
		System.out.println("How many nighttime minutes did you use?");
		nightMinutes = keyboard.nextInt();

		System.out.println("Billing Statement");
		System.out.println("===================");
		System.out.println("Daytime minutes: " + dayMinutes);
		System.out.println("Nighttime minutes: " + nightMinutes);
		totalMinutes = dayMinutes + nightMinutes;

		dayMinutes = dayMinutes - 400;
		if (dayMinutes <= 0)
		{
			nightMinutes = dayMinutes + nightMinutes;
			dayMinutes = 0;

			if (nightMinutes <=0)
			{
				nightMinutes = 0;
			}
		}

		addMinuteCost = (0.5 * dayMinutes + 0.1 * nightMinutes);
		connectionFee = (totalMinutes * 0.03);
		totalCost = addMinuteCost + connectionFee + 49.99;

		System.out.println("Basic Service > $49.99");
		System.out.println("Additional Minutes > $" + addMinuteCost);
		System.out.println("Connection Fees > $" + connectionFee );
		System.out.println("Subtotal > $" + totalCost);
		System.out.println("Scam tax > $" + (totalCost * 0.05));
		System.out.println("Total > $" + (totalCost * 1.05));
	}
}
