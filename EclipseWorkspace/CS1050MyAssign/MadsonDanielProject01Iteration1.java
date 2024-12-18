/*
Madson, Daniel
CS1050: Deborah Harding, T/R
Project 1 Iteration 2
Due Date 11/11/2024
Description:
this program is a grade calculator for a cs1050 professor
We display some information about the calculator, and some information about the course grading criteria.
Then we enter a grade for each category. The program calculates and outputs a percent grade and a letter 
grade for the student. The program then prompts the professor to enter grades for another student or for
the program to exit.
 */
import java.util.Scanner;
public class MadsonDanielProject01Iteration1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		displayCourseGrading();

		char charRepeat;
		Scanner input = new Scanner(System.in);
		
		do {
		//preparing for enterValidGrade method
		
		double finalGradePrint = enterValidGrade(105,0, input);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("The final class percentage grade is: " + finalGradePrint + "%");
		
		char charGradeLetter = determineLetterGrade(finalGradePrint);
		System.out.println("Final Letter Grade: " + charGradeLetter
				+ "\n-------------------------------------------------------------------------------");
		
		System.out.println("Do you wish to calculate another student's grade?"
				+ "\nEnter y for yes and n for no.");
		
		charRepeat = input.next().charAt(0);
		if (charRepeat != 'y') {
			System.out.println("Exiting program.");		
		}
		} while (charRepeat != 'n');
		
		input.close();
	}
	
	
/*
 * this method will display information about the course grading, like the grade categories and weights
 */
	public static void displayCourseGrading() {
		
		//display summary of program- grade categories and weights AND grading scale
		System.out.println("CS1050 Final Grade Calculator\n"
				+ "-------------------------------------------------------------------------------");
		System.out.println("This program will calculate a student's final grade,\n"
				+ "as well as displaying the necessary information to understand one's grade, \n"
				+ "such as: grade categories, grade weights, and the grading scale.\n"
				+ "-------------------------------------------------------------------------------");
		
		
		//declaring all grade % weight constants
		final double CLASS_PART_WEIGHT = 0.12;
		final double GUIDED_EXPL_WEIGHT = 0.22;
		final double MOD_QUIZZES_WEIGHT = 0.22;
		final double PROJECT_ITER_WEIGHT = 0.22;
		final double FINAL_EXAM_WEIGHT = 0.22;
		
		
		//display grade categories and weights
		System.out.println("Grade Category | % Weight\n"
				+ "-------------------------------------------------------------------------------");
		System.out.println("Class Participation: " + CLASS_PART_WEIGHT*100 + "%");
		System.out.println("Guided Exploration: " + GUIDED_EXPL_WEIGHT*100 + "%");
		System.out.println("Module Quizzes: " + MOD_QUIZZES_WEIGHT*100 + "%");
		System.out.println("Project Iterations: " + PROJECT_ITER_WEIGHT*100 + "%");
		System.out.println("Final Exam: " + FINAL_EXAM_WEIGHT*100 + "%");
		System.out.println("-------------------------------------------------------------------------------");
		
		
		//display grading scale
		System.out.println("Grading Scale\n"
				+ "-------------------------------------------------------------------------------");
		System.out.println("A: 90% to 100%");
		System.out.println("B: 80% to < 90%");
		System.out.println("C: 70% to < 80%");
		System.out.println("D: 60% to < 70%");
		System.out.println("F: < 60%");
		System.out.println("-------------------------------------------------------------------------------");
	}

/*
 * this method determines if a valid grade is entered; a valid grade is anything from 0 to 105
 */
	public static double enterValidGrade(double max, double min, Scanner input) {
		
		//valid grades are from 0 to 105
		
		//class participation
		System.out.println("Enter the grade for the Class Participation.");
		double gradeEntryCP = input.nextDouble();
		
		while ((gradeEntryCP < 0) || (gradeEntryCP > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryCP = input.nextDouble();
		}
		
		//guided exploration
		System.out.println("Enter the grade for the Guided Exploration");
		double gradeEntryGE = input.nextDouble();
		
		while ((gradeEntryGE < 0) || (gradeEntryGE > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryGE = input.nextDouble();
		}
		
		//module quizzes
		System.out.println("Enter the grade for the Module Quizzes");
		double gradeEntryMQ = input.nextDouble();
		
		while ((gradeEntryMQ < 0) || (gradeEntryMQ > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryMQ = input.nextDouble();
		}

		//project iterations
		System.out.println("Enter the grade for the Project Iterations");
		double gradeEntryPI = input.nextDouble();

		while ((gradeEntryPI < 0) || (gradeEntryPI > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryPI = input.nextDouble();
		}
		
		//final exam
		System.out.println("Enter the grade for the Final Exam");
		double gradeEntryFE = input.nextDouble();
		
		while ((gradeEntryFE < 0) || (gradeEntryFE > 105)) {
			System.out.println("Error: Enter a grade from 0 to 105");
			gradeEntryFE = input.nextDouble();
		}
		
		//declaring all grade % weight constants
		//we only need these here to calculate the grade, i would put into its own method but you said not to
		final double CLASS_PART_WEIGHT = 0.12;
		final double GUIDED_EXPL_WEIGHT = 0.22;
		final double MOD_QUIZZES_WEIGHT = 0.22;
		final double PROJECT_ITER_WEIGHT = 0.22;
		final double FINAL_EXAM_WEIGHT = 0.22;
		
		double finalGrade = ((gradeEntryCP*CLASS_PART_WEIGHT) + (gradeEntryGE*GUIDED_EXPL_WEIGHT) + 
				(gradeEntryMQ*MOD_QUIZZES_WEIGHT) + (gradeEntryPI*PROJECT_ITER_WEIGHT) +
				(gradeEntryFE*FINAL_EXAM_WEIGHT));
		
		return finalGrade;
	}

/*
 * this method takes in the calculated final grade for the student and assigns it the proper letter grade
 */

	public static char determineLetterGrade(double finalGradePrint) {
		
		char charFinalGrade;
		
		if (finalGradePrint > 90) {
			charFinalGrade = 'A';
		}
		else if ((finalGradePrint > 80) && (finalGradePrint < 90)) {
			charFinalGrade = 'B';
		}
		else if ((finalGradePrint > 70) && (finalGradePrint < 80)) {
			charFinalGrade = 'C';
		}
		else if ((finalGradePrint > 60) && (finalGradePrint < 70)) {
			charFinalGrade = 'D';
		}
		else {
			charFinalGrade = 'F';
		}
		
		return charFinalGrade;
	}
	
}