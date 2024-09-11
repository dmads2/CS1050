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
		System.out.println("Enter a character.");
		Scanner input = new Scanner(System.in);
		String aString = input.next();
		input.close();
		char someChar = aString.charAt(0);
		System.out.println("Character entered is " + someChar);
		
		
	}

}
