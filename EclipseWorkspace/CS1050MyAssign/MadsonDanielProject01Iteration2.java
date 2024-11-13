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
		
		
		displayCourseGrading();
		
		System.out.println("How many students are in the class?");
		int numberOfStudents = input.nextInt();
		
		for (int i = 1; i <= numberOfStudents; i++)
		{
			enterValidGrade();
		}
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
	public static double  enterValidGrade() {
		
		Scanner input = new Scanner (System.in);
		double validGradeDouble = input.nextDouble();
		
		while (validGradeDouble < 0 || validGradeDouble > 105) 
		{
			System.out.println("Enter a valid grade from 0 to 105");
			validGradeDouble = input.nextDouble();
		}
		
	} //end of enterValidGrade
} //end of class
