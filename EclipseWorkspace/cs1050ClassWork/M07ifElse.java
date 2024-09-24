/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class M07ifElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character.");
		char someChar = input.next().charAt(0);

		if(Character.isDigit(someChar))
		{
			System.out.println("its a number");
		}
		
		if(someChar == '5')
		{
			System.out.printf("chars are the same");
		}
		
		input.close();
		
		String str1 = "I love Java";
		String str2 = "I LOVE JAVA";
		
		if (str1.equals(str2))
		{ 
			System.out.println("str1 and str2 are the same");
		}
		

	}

}
