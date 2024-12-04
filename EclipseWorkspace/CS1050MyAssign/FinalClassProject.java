import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinalClassProject
{
	
	public static void main(String[] args) {
	
		//Array categories and percentage weights
		final int TOTAL_CATEGORIES_1050 = 5;
		String[] categories1050 = {"Class Participation","Guided Exploration",
				"Quizzes","Project Percent","Final Exam"};
		double[] percentWeights1050 = {.12,.22,.22,.22,.22};
		int MAX_STUDENTS_1050 = 10;
		
		/* UNCOMMENT OUT THE FOLLOWING AFTER YOU IMPLEMENT AND TEST EACH CLASS INDIVIDUALLY
		Course course1050 = new Course("CS1050", categories1050, percentWeights1050, MAX_STUDENTS_1050);
		
		try {
			System.out.println("\nSetting up course " + course1050.getCourseName());
            courseSetUp(course1050, TOTAL_CATEGORIES_1050, "course1050.txt");
            System.out.println("\nTotal Students in " + course1050.getCourseName()+ 
            		": " + course1050.getNumberStudents());
            course1050.displayCourseGrading();
            course1050.PostFinalGrades();           
            course1050.displayCourseSummary();
            course1050.writeSummaryToFile();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Can't Upload course information" + e.getMessage());
        }
		
		//Array categories and percentage weights
		final int TOTAL_CATEGORIES_2040= 4;
		String[] categories = {"Class Participation","Homework",
				"Midterm","Final Exam"};
		double[] percentWeights = {.15, .25, .3, .3};
		int MAX_STUDENTS_2040 = 4;
		
		Course course2040 = new Course("CS2040", categories, percentWeights, MAX_STUDENTS_2040);
		
		try {
			System.out.println("\nSetting up course " + course2040.getCourseName());
            courseSetUp(course2040, TOTAL_CATEGORIES_2040, "course2040.txt");
            System.out.println("\nTotal Students in " + course2040.getCourseName()+ 
            		": " + course2040.getNumberStudents());
            course2040.displayCourseGrading();
            course2040.PostFinalGrades();           
            course2040.displayCourseSummary();
            course2040.writeSummaryToFile();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Can't Upload course information" + e.getMessage());
        }
		
	*/	

	}//end of main
	

	

}//end of Final Project class


//person class
class Person {
	
	String firstName;
	String lastName;
	String email;
	
	static int numberOfPeople = 0;

	void createPerson(String firstName, String lastName, String email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		numberOfPeople++;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
}//end of Person class

//instructor class
class Instructor 
	extends Person {

	
}//end of Instructor class


//student class
class Student 
	extends Person{
	
	static int numberOfStudents = 0;
	
	void createStudent(String firstName, String lastName, String email, double[] grades) {
		numberOfStudents++;
	}
	
	public double[] getGrades() {
		int i = numberOfStudents;
		return;
	}
	
	public void setFinalGrade(double finalGrade) {
		
	}
	
	public double getFinalGrade() {
		
	}
}//end of Student class


//course class
class Course {
	
	
}//end of Course Class





