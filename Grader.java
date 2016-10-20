/*********************************
*	Grader.java
*
*	Programmer: Ben Michener
*	Date: 9/28/16
*	Version: 1.0
*
*	Program Description: This program takes the average of five test grades
*	and tells the user whether their average falls in to an A, B, C, D, or F
*	grade range.
**********************************/
import java.util.Scanner;
public class Grader
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Grader! This program will help determine your average based on 5 test sccores.");
		System.out.println("Please enter your 5 test scores.");

		int grade1 = keyboard.nextInt();
		int grade2 = keyboard.nextInt();
		int grade3 = keyboard.nextInt();
		int grade4 = keyboard.nextInt();
		int grade5 = keyboard.nextInt();

		double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

		if (average >= 90)
		{
			System.out.println("Your grade is an A");
		}
		if (average >= 80 && average < 90)
		{
			System.out.println("Your grade is a B");
		}
		if (average >= 70 && average < 80)
		{
			System.out.println("Your grade is a C");
		}
		if (average >= 60 && average < 70)
		{
			System.out.println("Your grade is a D");
		}
		if (average < 60)
		{
			System.out.println("Your grade is an F");
		}
	}
}
