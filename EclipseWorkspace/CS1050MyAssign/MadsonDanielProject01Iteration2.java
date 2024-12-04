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
public class MadsonDanielProject01Iteration2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		displayCourseGrading();
		
		System.out.println("How many students are in the class?");
		int numberOfStudents = input.nextInt();

		//String [] gradeCategoryNames = {"Class Participation", "Guided Exploration", "Module Quizzes", "Projects", "Final Exam"};
		double[] gradeCategoryWeights = {0.12, 0.22, 0.22, 0.22, 0.22};
		//double[] studentFinalClassGrades = new double [5];
		
		
		for (int i = 1; i <= numberOfStudents; i++)
		{
			enterValidGrade(input);
		}
		
		//double[] copyOfGrades = studentGrades;
		
		
	} //end of main

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
				
			} //end of displayCourseGrading
	
	//this method will make sure we get valid inputs for the grades so we dont check later; valid grades are from 0 to 105
	public static double[] enterValidGrade(Scanner input) {
		
		//we will reuse this 1d array for each student
		double[] studentGrades = new double[5];
			
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the grades for the student.");
			studentGrades[i] = input.nextDouble();
		}
		return studentGrades; //need to return this to main so we can use it in other methods
	} //end of enterValidGrade
	
	//this method will calculate the final grade 
	public static double calculateFinalGrade(double gradeCategoryWeights[], double copyOfGrades[]) {
		
		double calculatedGrade = 0;
		
		for (int i = 0; i < 5; i++) {
			//calculatedGrade = gradeCategoryWeights[i] * studentGrades[i];
		}
	}//end of calculateFinalGrade()
	
	//this method determines the letter grade of the grade that we just calculated 
	//it will also return the char 
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
} //end of class
