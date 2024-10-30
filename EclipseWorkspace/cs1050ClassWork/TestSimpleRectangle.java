/**
 * 
 */

/**
 * 
 */
public class TestSimpleRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleRectangle rectangle1 = new SimpleRectangle();
		double area = rectangle1.getArea();
		System.out.println("the area of rectangle 1 is: " + area);
	} //end of main
} //end of class


//starting to define the class
class SimpleRectangle {
	double width;
	double height;
	//we dont need area because we will just return width*height
	
	//default rectangle
	SimpleRectangle() {
		width = 1;
		height = 1;
	}
	
	SimpleRectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	//doing perimeter for fun
	double getPerimeter() {
		return width*2 + height*2;
	}
	
	void setWidth(double newWidth) {
		width = newWidth;
	}
	
	void setHeight(double newHeight) {
		height = newHeight;
	}
} //end of defining class






