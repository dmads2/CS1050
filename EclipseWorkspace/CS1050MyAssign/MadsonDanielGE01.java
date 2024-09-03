/*
 * Daniel Madson
 * CS 1050
 * T/R Section
 * 9/2/2024
 * GE01
 * This program will calculate grades and also explain a little bit about myself.
 * 
 */

/*
 * 
 */
public class MadsonDanielGE01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//two paragraphs about myself
		
		System.out.println("Hello my name is Daniel Madson. I've been passionate about computers ever since I first started playing videogames.");
		System.out.println("This has led me to pursue a computer science degree. Although I am not a huge fan, I think I will stick it out anyway,");
		System.out.println("as I feel like it is a very valuable degree and I don't necessarily need to go into software development with it.");
		System.out.println("Perhaps I will go into a different tech role, or maybe even a completely different industry.");
		System.out.println();
		System.out.println("At the moment, I would love to finish college as soon as possible, so I am planning on taking winter and summer classes.");
		System.out.println("Generally speaking, programming is not my passion nor do I find it very interesting, so I am thinking about taking a");
		System.out.println("minor in business or maybe finance, as that is what I really enjoy- as long as it does not push back my graduation.");
		System.out.println();
		
		//creating constants for grade weights
		
		final double GE_WEIGHT = 0.15;
		final double PART_WEIGHT = 0.10;
		final double COMM_WEIGHT = 0.10;
		final double QUIZ_WEIGHT = 0.10;
		final double PROJECT_WEIGHT = 0.20;
		final double MIDTERM_WEIGHT = 0.15;
		final double FINALEXAM_WEIGHT = 0.20;
		
		//declaring my assignment grades for future calculation
		
		double gegrade = 95.0;
		double participationgrade = 92.0;
		double commgrade = 88.0;
		double quizgrade = 87.0;
		double projectgrade = 93.0;
		double midtermgrade = 70.0;
		double finalexamgrade = 85.0;
		
		//calculate final grade
		
		double finalgrade = ((gegrade * GE_WEIGHT) + (participationgrade * PART_WEIGHT) + (commgrade * COMM_WEIGHT) + (quizgrade * QUIZ_WEIGHT) + 
				(projectgrade * PROJECT_WEIGHT) + (midtermgrade * MIDTERM_WEIGHT) + (finalexamgrade * FINALEXAM_WEIGHT));
		
		/*runtime error
		int number = 10;
		System.out.print(number / 0);
		*/

		/*logic error
		finalgrade = finalgrade + gegrade;
		*/
		
		//print name and final grade (with 2 decimal points only)
		System.out.println("Madson, Daniel");
		System.out.printf("%.2f",finalgrade);

		

	}

}
