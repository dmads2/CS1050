/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class MadsonDanielGE02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//get first and last names for student 1, get initials as chars, then store as strings
		System.out.println("Student 1: Enter your first name");
		String s1FirstName = input.next();
		char s1FirstInit = s1FirstName.charAt(0);
		
		System.out.println("Student 1: Enter your last name");
		String s1LastName = input.next();
		char s1LastInit = s1LastName.charAt(0);
		
		String s1PrintFirstInit = Character.toString(s1FirstInit);
		String s1PrintLastInit = Character.toString(s1LastInit);
		
		//get first and last names for student 2, get initials as chars, then store as strings
		System.out.println("Student 2: Enter your first name");
		String s2FirstName = input.next();
		char s2FirstInit = s2FirstName.charAt(0);
		
		System.out.println("Student 2: Enter your last name");
		String s2LastName = input.next();
		char s2LastInit = s2LastName.charAt(0);
		
		String s2PrintFirstInit = Character.toString(s2FirstInit);
		String s2PrintLastInit = Character.toString(s2LastInit);
		
		//determine print order by comparing last initials
		//ascii logic is a little counter intuitive here
		
		//not sure if this is the desired output, but the program is functional
		
		if (s1LastInit < s2LastInit)
		{
			System.out.println("Student 2: " + s1PrintFirstInit + "." + s1PrintLastInit + ".");
			System.out.println("Student 1: " + s2PrintFirstInit + "." + s2PrintLastInit + ".");
		}
		else
		{
			System.out.println("Student 1: " + s2PrintFirstInit + "." + s2PrintLastInit + ".");
			System.out.println("Student 2: " + s1PrintFirstInit + "." + s1PrintLastInit + ".");
		}

		input.close();
		 
	}

}
