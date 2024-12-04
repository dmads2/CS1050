
// 1 Fix the way the class is implemented and how the variables are being accessed in main
// 2 Generate Comments  and update with information
// 3 Troubleshoot the problem with the output for area and perimeter


public class TestArrayRectangle {

	public static void main(String[] args) {
		
		System.out.println("Number of rectangles: " + BasicRectangle.getNumberOfRectangles());
		
		BasicRectangle rectangle1 = new BasicRectangle();
		rectangle1.length= 8.5;
		rectangle1.width = 5.2;
		
		System.out.printf("Rectangle width: %.1f and height: %.1f\n",
				rectangle1.width, rectangle1.length);
		
		
	    System.out.println("The area of the rectangle 1 is " + rectangle1.getArea());
	    System.out.println("The perimeter of the rectangle 1 is " + rectangle1.getPerimeter());
		System.out.println("Number of rectangles: " + BasicRectangle.getNumberOfRectangles());
		
		
		BasicRectangle rectangle2 = new BasicRectangle(4, 5);
	    System.out.println("The area of the rectangle 2 is " + rectangle2.getArea());
	    System.out.println("The perimeter of the rectangle 2 is " + rectangle1.getPerimeter());
	    System.out.println("Number of rectangles: " + BasicRectangle.getNumberOfRectangles());
	    
	    //5 In the  code declare a third rectangle
	    BasicRectangle rectangle3 = new BasicRectangle(5,10);
	    //6 Declare an array called rectangles  to store 3 SimpleRectangle’s
	    BasicRectangle[] rectangles = new BasicRectangle[3];
	    //7 Assign rectangle1 to index 0, rectangle2 to index 1 and rectangle 3 to index 2.
	    rectangles[0] = rectangle1;
	    rectangles[1] = rectangle2;
	    rectangles[2] = rectangle3;
	    
	    //8 Use the array index to set the width of rectangle3 length to 10.4
	    rectangles[2].setLength(10.4);
	    //9 Use the array index to display the area of rectangle3. 
	    System.out.printf("The area of rectangle 2 is %.2f", rectangles[2].getArea());
	    //10 Create a method iterate through the array to print the perimeter of each rectangle
	    
	    printRectanglesPerimeter(rectangles);
	    
	    //11 Create a method to find the index of the rectangle with the largest length 
	    
	    int largestLengthIndex = getLargestLengthIndex(rectangles);
	    System.out.println("The rectangle with the largest length is at index " + largestLengthIndex);
	    
	    //12 Print the area of the rectangle with the largest length

	    System.out.printf("The area of the largest rectangle is %.2f", rectangles[largestLengthIndex].getArea());
	    
	}// end main

	public static void printRectanglesPerimeter(BasicRectangle[] rectanglesReference) {
		for (int i = 0; i < rectanglesReference.length; i++) {
			System.out.printf("\nThe perimeter of rectangle %d is %.2f", i, rectanglesReference[i].getPerimeter());
		}
	}
	
	public static int getLargestLengthIndex(BasicRectangle[] rectanglesReference) {
		
		int indexValue = 0;
		double largest = rectanglesReference[0].getLength();
		for (int i = 1; i< rectanglesReference.length; i++) {
			if(largest < rectanglesReference[i].getLength()) {
				largest = rectanglesReference[i].getLength();
				indexValue = i;
			}
		}
		return indexValue;
	}
	
	
} //end TestBasicRectangle Class	
	
	

class BasicRectangle {
	
	  double length = 1;
	  double width = 1;
	  
	  
	  static int numberOfRectangles = 0;
	

	BasicRectangle() {
		  numberOfRectangles++;
	  }
	


	BasicRectangle(double length, double width) {
		  this.length = length;
		  this.width  = width;
		  numberOfRectangles++;
	  }
	
	  public double getLength() {
		  return this.length;
	  }
	  
	  public double getWidth() {
		  return this.width;
	  }
	  
	  public void setLength(double length) {
		  this.length = length;
	  }
	  
	  public void setWidth(double width) {
		  this.width = width;
	  }
	  
	  public double getArea() {
	    return this.length * this.width;
	  }

	  public double getPerimeter() {
	    return 2* (this.width + this.length);
	  }
	  
	  public static int getNumberOfRectangles() {
	    return numberOfRectangles;
	  } 
	  
	  
}// BasicRectangle Class


