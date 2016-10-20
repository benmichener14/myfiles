import java.util.Scanner;
public class CarCare
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Hello! Welcome to CarCare. We're here to help you with your money!");

	System.out.println("How many tires do you buy each year?");
	double tireNum = keyboard.nextDouble();
	System.out.println("How much does each tire cost?");
	double tirePrice = keyboard.nextDouble();

	System.out.println("How many windshield wipers do you buy each year?");
	double wiperNum = keyboard.nextDouble();
	System.out.println("How much does each windshield wiper cost?");
	double wiperPrice = keyboard.nextDouble();

	System.out.println("How much do you spend on brakes each year?");
	double brakesPrice = keyboard.nextDouble();

	System.out.println("It costs you $" + (tireNum * tirePrice + wiperNum * wiperPrice + brakesPrice) + " per year to maintain your car.");
	}
}