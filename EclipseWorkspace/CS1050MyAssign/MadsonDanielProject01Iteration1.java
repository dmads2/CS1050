/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class MadsonDanielProject01Iteration1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		displayCourseGrading();
		
		//preparing for enterValidGrade method
		Scanner input = new Scanner(System.in);
		//enterValidGrade(105, 0, input);
		
		double finalGradePrint = enterValidGrade(105,0, input);
		System.out.println("The final class percentage grade is " + finalGradePrint + "%");
		
	}
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
	public static double enterValidGrade(double max, double min, Scanner input) {
		
		//valid grades are from 0 to 105
		Scanner gradeInput = new Scanner(System.in);
		
		//class participation
		System.out.println("Enter the grade for the Class Participation.");
		double gradeEntryCP = gradeInput.nextDouble();
		
		while ((gradeEntryCP < 0) || (gradeEntryCP > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryCP = gradeInput.nextDouble();
		}
		
		//guided exploration
		System.out.println("Enter the grade for the Guided Exploration");
		double gradeEntryGE = gradeInput.nextDouble();
		
		while ((gradeEntryGE < 0) || (gradeEntryGE > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryGE = gradeInput.nextDouble();
		}
		
		//module quizzes
		System.out.println("Enter the grade for the Module Quizzes");
		double gradeEntryMQ = gradeInput.nextDouble();
		
		while ((gradeEntryMQ < 0) || (gradeEntryMQ > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryMQ = gradeInput.nextDouble();
		}

		//project iterations
		System.out.println("Enter the grade for the Project Iterations");
		double gradeEntryPI = gradeInput.nextDouble();

		while ((gradeEntryPI < 0) || (gradeEntryPI > 105)) {
			System.out.println("Error: Enter a grade from 0 and 105");
			gradeEntryPI = gradeInput.nextDouble();
		}
		
		//final exam
		System.out.println("Enter the grade for the Final Exam");
		double gradeEntryFE = gradeInput.nextDouble();
		
		while ((gradeEntryFE < 0) || (gradeEntryFE > 105)) {
			System.out.println("Error: Enter a grade from 0 to 105");
			gradeEntryFE = gradeInput.nextDouble();
		}
		gradeInput.close();
		
		//declaring all grade % weight constants
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
	
}