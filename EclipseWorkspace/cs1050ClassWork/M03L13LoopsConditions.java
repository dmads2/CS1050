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
	//2.1.6 GE03
		max(56);
		
	}
		public static int max(int forMaxNum)
		{
		
		//2.1.2 GE03
		//code to sum the numbers from 1 to a max using a for loop
		int maxForSum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number you want to be the max");
		int forMax = input.nextInt();
		
		for (int maxFor = 1; maxFor <= forMax; maxFor++)
		{
			maxForSum = maxFor + maxForSum;
		}
		
		input.close();
		System.out.println("using a for loop, the sum of the numbers 1 to " + forMax + " is " + maxForSum);
		
		return forMaxNum;
		
		}
//-------------------------------------------------------------------------------------
		
		
		/*
		
		//2.1.3 GE03
		//code to sum the numbers from 1 to max using a while loop
		int whileMax = 1;
		int whileMaxSum = 0;
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("enter a number you want to be the max");
		int maxWhile = input1.nextInt();
		
		while (whileMax <= maxWhile)
		{
			whileMaxSum = whileMax + whileMaxSum;
			whileMax++;
		}
		
		input1.close();
		System.out.println("using a while loop, the sum of the numbers 1 to " + maxWhile + " is " + whileMaxSum);
	
		*/
			
//-------------------------------------------------------------------------------------	
		
		/*
		
		//2.1.4 GE03
		//code to sum the odd numbers from 1 to 5, should equal 9 because 1+3+5=9
		 
		int oddSum = 0; //need this here for scope reasons
		
		for (int oddTest = 1; oddTest <=5; oddTest += 2) //start at 1, increment by 2 until it equals 5
		{
			oddSum = oddSum + oddTest;
			//this is the same as oddSum += oddTest
		}
		
		System.out.println("the sum of the odd numbers between 1 and 5 is: " + oddSum);
		
		*/
		
//-------------------------------------------------------------------------------------	
 
		/*
		
		//2.1.5 GE03
		//code to ask for an age from the user, if the age is not greater than 0, repeat question until valid age is entered
		 
		Scanner input2 = new Scanner(System.in);
		
		int age = 0;
		
		// Loop until the user enters a valid age
        do 
        {
            System.out.println("Please enter a valid age (greater than 0)");
            age = input2.nextInt();
            
        } while (age <= 0);
        
		input2.close();
		//hmm im not sure im doing this part right, it would be better if I asked them to re input but im not sure how to do that
		
		
		*/
		
		
//-------------------------------------------------------------------------------------		
		//everything below this line is not for GE03
		
		/*
		
		//code to sum the numbers from 1 to 5 using a while loop
		int whileTest = 1;
		int whileTestSum = 0;
		
		while (whileTest <= 5)
		{
			whileTestSum = whileTest + whileTestSum;
			whileTest++;
		}
		
		System.out.println("using a while loop, the sum of the numbers 1 through 5 is: " + whileTestSum);
		
		*/
		
		
//-------------------------------------------------------------------------------------
		
		/*
		
		//code to sum the odd numbers from 1 to 5, should equal 9 because 1+3+5=9
		 * 
		int oddSum = 0; //need this here for scope reasons
		
		for (int oddTest = 1; oddTest <=5; oddTest += 2) //start at 1, increment by 2 until it equals 5
		{
			oddSum = oddSum + oddTest;
			//this is the same as oddSum += oddTest
		}
		
		System.out.println("the sum of the odd numbers between 1 and 5 is: " + oddSum);
		
		*/
		
		/*
		
		//code to ask the user to enter an age, if age is not greater than 0 repeat the question until a valid age is entered
		Scanner input = new Scanner(System.in);
		int loopControl = 1;
		while (loopControl > 0)
		{
			System.out.println("enter an age that is greater than 0");
			String ageInput = input.next();
			if (ageInput > 0);
		}
		
		*/
		
		
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
		
		*/
		
		
}
