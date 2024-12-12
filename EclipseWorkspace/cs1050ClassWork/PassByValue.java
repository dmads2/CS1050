/**
 * 
 */

/**
 * 
 */
public class PassByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 1;
		
		changeNum(num);
		
		System.out.println("The number is: " + num);	
		//outputs: the number is: 1 
		//the number is unchanged, and is not 2
	}
	
	public static void changeNum(int num) {
		num = 2;
	}

}
