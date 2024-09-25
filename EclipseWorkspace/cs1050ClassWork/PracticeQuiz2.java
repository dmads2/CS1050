/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class PracticeQuiz2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select a rental option: 1,2,3.");
		
		Scanner input = new Scanner(System.in);
		int rentalOpt = input.nextInt();
		
		if ((rentalOpt >= 1) && (rentalOpt <= 3))
		{
			System.out.println("how many bikes would you like to rent?");
			System.out.println("the limit is 4 bikes.");
			int numberOfBikes = input.nextInt();
			
			if ((numberOfBikes >= 1) && (numberOfBikes <= 4))
				{
					System.out.println("Rental option number is " + rentalOpt + " and " + numberOfBikes + " bikes");
				}
			else
				{
					System.out.println("invalid number of bikes.");
				}
		}
		else 
			{
				System.out.println("Invalid rental option. Quitting program");
			}
		
		input.close();
		}
		
	}

