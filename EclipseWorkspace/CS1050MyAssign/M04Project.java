import java.util.*;

public class M04Project
{
	public static void main(String[] args) {

		//constants
		final int MIN_GRADE = 0;
		final int MAX_GRADE = 105;
		final int TOTAL_CATEGORIES = 5;		

		//Array categories and percentage weights
		String[] categories = {"Class Participation","Guided Exploration",
				"Quizzes","Project Percent","Final Exam"};
		double[] percentWeights = {.12,.22,.22,.22,.22};

		displayCourseGrading(categories, percentWeights);

		// Create new input object to read information entered by the user's keyboard
		Scanner input = new Scanner(System.in);

		System.out.printf("How many students are in the class? ");
		int numberStudents = input.nextInt();


		//store student grades and final grades
		double[] studentCategoryGrades = new double[TOTAL_CATEGORIES];
		double[] classFinalGrades = new double[numberStudents];
		double finalGrade = 0;
		char letterGrade = 'z';
		
		//loop to get the grades for each student in the class
		for(int studentCount = 0; studentCount < numberStudents; studentCount++ )
		{	
			System.out.printf("\nEnter grades for student %d \n", (studentCount + 1));
			enterStudentGrades(studentCategoryGrades,categories, MIN_GRADE, MAX_GRADE, input);
			
			finalGrade = calculateFinalGrade(studentCategoryGrades, percentWeights);

			//store final grades for each student
			classFinalGrades[studentCount] = finalGrade;

			letterGrade = determineLetterGrade(finalGrade);								

			//Display results
			System.out.println("------------------------------------------------");	
			System.out.printf("\nStudent %d ", (studentCount + 1));
			System.out.printf("Final Percentage: %.2f\n", finalGrade);
			System.out.printf("Final Letter Grade: %s\n", letterGrade);
			System.out.println("------------------------------------------------");

		}

		displayClassFinalGrades(classFinalGrades);

		double finalGradesAverage = calculateClassAverage(classFinalGrades);
		double finalGradesMin = findClassMin(classFinalGrades);
		double finalGradesMax = findClassMax(classFinalGrades);

		System.out.printf("Class average: %.2f\n",finalGradesAverage);
		System.out.printf("Class min: %.2f\n",finalGradesMin);
		System.out.printf("Class max: %.2f\n",finalGradesMax);
		System.out.println("\nExiting grade caclulator ");

		input.close();

	}//end of main

	/**
	 * @param studentGrades
	 * @param categoryNames
	 * @param min
	 * @param max
	 * @param keyboard
	 */
	public static void enterStudentGrades(double studentGrades[], String categoryNames[], int min, int max, Scanner keyboard )
	{
		for(int categoryColumn = 0; categoryColumn < studentGrades.length; categoryColumn++ )
		{
			System.out.printf("\nEnter the %s grade: ", categoryNames[categoryColumn]);
			studentGrades[categoryColumn] = getValidGrade(min, max, keyboard);

		}
	}

	public static double findClassMin(double grades[])
	{
		double min = grades[0]; 

		for(int index = 1; index< grades.length; index++)
		{
			if(grades[index] < min)
			{
				min = grades[index];
			}
		}
		return min;
	}
	
	public static double findClassMax(double grades[])
	{
		double max = grades[0]; 

		for(int index = 1; index< grades.length; index++)
		{
			if(grades[index] > max)
			{
				max = grades[index];
			}
		}
		return max;
	}
	
	public static double calculateClassAverage(double grades[])
	{
		double sum = 0;
		double average =0;

		for(int studentCount = 0; studentCount< grades.length; studentCount++)
		{
			sum = sum + grades[studentCount];
		}

		average = sum/grades.length;

		return average;
	}

	/**
	 * Repeats prompting for double number until number with in range of min and max
	 * @param int min 
	 * @param int max
	 * @param inputReader
	 * @return double valid value
	 */
	public static double getValidGrade(int min, int max, Scanner inputReader)
	{
		double validDouble = -1;

		do
		{
			try
			{					
				System.out.printf("Enter a value from %d to %d ", min, max);
				validDouble = inputReader.nextDouble();	
			}
			catch(InputMismatchException ex)
			{
				System.out.printf("Error: Enter a value from %d to %d ", min, max);
				//clears input stream of characters that weren't a double 
				inputReader.nextLine();
			}

		}while((validDouble <min || validDouble > max)); 

		return validDouble;

	}//end getValidDouble

	/**
	 * Determines letter grade for
	 * @param double finalGrade
	 * @return char letter grade
	 */
	public static char determineLetterGrade(double finalGrade)
	{
		char letterGrade;
		// Determine correct letter grade
		if (finalGrade >= 90)
		{
			letterGrade = 'A';
		}
		else if (finalGrade >= 80)
		{
			letterGrade = 'B';
		}
		else if (finalGrade >= 70)
		{
			letterGrade = 'C';
		}
		else if (finalGrade >= 60)
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}

		return letterGrade;
	}

	public static void displayClassFinalGrades(double grades[])
	{

		System.out.println("\n***** Class Final Grades *******");
		for(int studentCount = 0; studentCount< grades.length; studentCount++)
		{
			System.out.printf("Student %d: %.2f ", (studentCount + 1), grades[studentCount]);
			System.out.printf(" %c\n", determineLetterGrade(grades[studentCount]));
		}
	}

	public static double calculateFinalGrade(double studentGrades[], double gradeWeights[])
	{
		double finalGrade = 0;
		double categoryGrade = 0;

		for(int categoryColumn = 0; categoryColumn < studentGrades.length; categoryColumn++ )
		{

			categoryGrade = studentGrades[categoryColumn] * gradeWeights[categoryColumn];
			finalGrade += categoryGrade;

		}

		return finalGrade;
	}

	public static void displayCourseGrading(String categoryNames[], double gradeWeights[])
	{

		//create header 
		System.out.println("**********************************");
		System.out.println("CS1050 Final Grade Calculator");
		System.out.println("**********************************\n");

		//Display category percent weight
		System.out.println("------------------------------");
		System.out.println("Category:Percent");
		System.out.println("------------------------------");		

		for(int categoryColumn = 0; categoryColumn < categoryNames.length; categoryColumn++ )
		{	
			System.out.printf("%s Grade: %.2f\n", categoryNames[categoryColumn], gradeWeights[categoryColumn]);
		}

		//Display Letter Grade Range
		System.out.println("\n-------------------------------");
		System.out.println("Letter Grade Range");
		System.out.println("-------------------------------");
		System.out.println("A: 90 to 100");
		System.out.println("B: 80 to < 90");
		System.out.println("C: 70 to < 80");
		System.out.println("D: 60 to < 70");
		System.out.println("F: < 60\n");

	}


}//end of M04Project class
