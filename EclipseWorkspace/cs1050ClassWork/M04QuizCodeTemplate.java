import java.util.Scanner;


//create method called calculate to compute the circumference of a circle given the radius using the formula 2pir
// use 3.14 for pi
//call the method and then print the circumference from main
public class M04QuizCodeTemplate
{

	public static void main(String[] args)
	{
		//double circumference = 0; why did you put this here??
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius");
        double radius = input.nextDouble();
		
        // Write Code Below to call method and then print out circumference
		double printCircumference = calculate(radius);
		
		System.out.printf("The circumference of the circle with radius is %.1f", printCircumference);
		//unsure how exactly you want the printout to be formatted, so I just used 1 decimal point
		
        input.close();
    } 
	//write method below to calculate circumference
	
	public static double calculate(double radius) {
		final double PI = 3.14;
		double circumference = (2*PI*radius);
		
		return circumference;
	}
}
