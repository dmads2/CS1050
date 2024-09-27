/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class MadsonDanielM02Quiz 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a grade from 0 to 100.");
		double grade = input.nextDouble();
		
		if ((grade >= 0) && (grade <= 100))
		{
			if (grade >= 90)
			{
				System.out.println("Your letter grade is A.");
			}
			else if ((grade < 90) && (grade >= 80))
			{
				System.out.println("Your letter greade is B.");
			}
			else if ((grade < 80) && (grade >= 70))
			{
				System.out.println("Your letter grade is C.");
			}
			else if ((grade < 70) && (grade >= 60))
			{
				System.out.println("Your letter grade is D.");
			}
			else if (grade < 60)
			{
				System.out.println("Your letter grade is F.");
			}
		}
		else 
		{
			System.out.println("The grade you entered is invalid.");
		}
		
		input.close();
	}
}

