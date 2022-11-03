package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	/* 
	 * This initializes variables to default values
	 * @param none
	 * @return none
	 */
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	/*
	 * This initializes instance variables with parameters
	 * @param double length
	 * @param double width
	 * @return none
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/*
	 * This calculates area of rectangle
	 * @param none
	 * @return area of rectangle
	 */
	public double area() {
		double area = length*width;
		return area;
	}
	
	/*
	 * This calculates perimeter of rectangle
	 * no parameters
	 * @return perimeter of rectangle
	 */
	public double perimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}
	
	/*
	 * Determines if rectangle is a square
	 * no parameters
	 * @return true or false if it is a square
	 */
	public boolean isItSquare() {
		return (length == width);
	}
	
	/*
	 * Draws the rectangle
	 * no parameters or returns
	 */
	public void drawSquare() {
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, length);
		StdDraw.rectangle(width/2, length/2, width/2, length/2);
	}
	
	// toString()
	/*
	 * Creates string to return
	 * no parameters
	 * @return string
	 */
	public String toString() {
		return "Length: " + length + "\nWidth: " + width + "\nArea: " + area() + 
				"\nPerimeter: " + perimeter() + "\nIs it square? " + isItSquare();
	}
	
	// compare to other rectangle area
	/*
	 * Compares area of two rectangles
	 * @param 2nd Rectangle
	 * @return true of false bigger
	 */
	public boolean compareArea(Rectangle numTwo) {
		double area1 = area();
		double area2 = numTwo.area();
		return area1 > area2;
	}
	
	public static void main(String[] args) {
		Rectangle recOne = new Rectangle(0.8, 2);
		Rectangle recTwo = new Rectangle(1, 1);
		Rectangle recThree = new Rectangle(1.6, 1);
		System.out.println(recOne.toString());
		System.out.println(recTwo.toString());
		System.out.println(recThree.toString());
		System.out.println(recOne.compareArea(recThree));
		System.out.println(recOne.compareArea(recTwo));
	}

}
