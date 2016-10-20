import java.util.Scanner;
public class Tip
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What was the check total?");
		double check = keyboard.nextDouble();
		System.out.println("How much do you want to tip?");
		double percent = keyboard.nextDouble();
		double tip = check * (percent / 100);
		double total = check + tip;
		System.out.println("The tip is $" + tip + ", which makes for a total of $" + total);
	}
}