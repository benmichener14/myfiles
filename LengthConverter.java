import java.util.Scanner;
public class LengthConverter
{
	public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			double inch = 0;
			double cm = 0;
			System.out.println("Welcome to Length Converter!");
			System.out.println("This program helps convert measurements in Inches to Centimeters");
			System.out.println("Please enter the value that you wish to convert");
			inch = keyboard.nextDouble();
			cm = inch * 2.54;
			System.out.println(inch + " inches is equal to approximately " + cm + " centimeters.");


		}
	}

