import java.lang.Math;
public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	
	/** No-arg default constructor */
	public Triangle() {
	
	}

	/** A constructor that creates a triangle with the specified side1, side2, and side3 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Accessor method for side1 */
	public double getSide1() {
		return side1;
	}
	
	
	/** Accessor method for side2 */
	public double getSide2() {
		return side2;
	}
	
	
	/** Accessor method for side3 */
	public double getSide3() {
		return side3;
	}
	
	
	/** Return the area of this triangle */
	public double getArea() {
		
		// calculate triangle area 
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1)*(s - side2)*(s - side3));
		
		return area;
	}
	
	
	/** Return the perimeter of this triangle */
	public double getPerimeter() {
		
		// calculate perimeter
		double perimeter = side1 + side2 + side3;
		
		return perimeter;
	}
	
	
	/** Return string description for the triangle */
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
	}
	
	
} // End Triangle class
