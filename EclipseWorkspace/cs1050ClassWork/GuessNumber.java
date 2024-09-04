/**
 * 
 */

import java.util.Scanner; 
/**
 * This program takes user input to see if they can guess the 
 * random number generated
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Main method
	    int number = (int)(Math.random() * 101);

	    Scanner input = new Scanner(System.in);
	    System.out.println("Guess a magic number between 0 and 100");
	    
	    int guess = -1;
	    while (guess != number) {
	      
	      System.out.print("\nEnter your guess: ");
	      guess = input.nextInt();
	      
	      //input.close(); 

	      if (guess == number)
	        System.out.println("Yes, the number is " + number);
	      else if (guess > number)
	        System.out.println("Your guess is too high");
	      else
	        System.out.println("Your guess is too low");
	      
	      input.close(); 

	    } 
		
	}

}
