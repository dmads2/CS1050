/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class M03L13LoopsConditions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		//code to sum the numbers from 1 to 5 using a for loop, should equal 15
		int forTestSum = 0; //need this here for scope reasons
		
		for (int forTest = 1; forTest <=5; forTest++) //start at 1, increment by 1 until it equals 5
		{
			forTestSum = forTestSum + forTest;
			//this is the same as forTestSum += forTest
			//think of it as 0 + 1 =1, 1 + 2 =3, 3 + 3 =6, 6 + 4 =10, 10 + 5 =15
		}
		
		System.out.println("using a for loop, the sum of the numbers 1 through 5 is: " + forTestSum);
		
		
		
		//code to sum the numbers from 1 to 5 using a while loop
		int whileTest = 1;
		int whileTestSum = 0;
		
		while (whileTest <= 5)
		{
			whileTestSum = whileTest + whileTestSum;
			whileTest++;
		}
		
		System.out.println("using a while loop, the sum of the numbers 1 through 5 is: " + whileTestSum);
		
		
		
		//code to sum the odd numbers from 1 to 5, should equal 9 because 1+3+5=9
		int oddSum = 0; //need this here for scope reasons
		
		for (int oddTest = 1; oddTest <=5; oddTest += 2) //start at 1, increment by 2 until it equals 5
		{
			oddSum = oddSum + oddTest;
			//this is the same as oddSum += oddTest
		}
		
		System.out.println("the sum of the odd numbers between 1 and 5 is: " + oddSum);
		
		*/
		
		//code to ask the user to enter an age, if age is not greater than 0 repeat the question until a valid age is entered
		Scanner input = new Scanner(System.in);
		int loopControl = 1;
		while (loopControl > 0)
		{
			System.out.println("enter an age that is greater than 0");
			String ageInput = input.next();
			if (ageInput > 0)
		}
		input.close();
	}

}
