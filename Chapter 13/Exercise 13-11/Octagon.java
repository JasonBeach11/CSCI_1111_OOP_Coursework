
import java.lang.Math;
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

	private double sideLength = 1.0;
	
	
	/** No-arg default constructor */
	public Octagon() {	
	}
	
	
	/** Create Octagon based on side length (assume all sides are of equal length */
	public Octagon(double sideLength) {
		this.sideLength = sideLength;
	}
	
	
	/** Get side length */
	public double getSideLength() {
		return sideLength;
	}
	
	
	/** Return Area */
	@Override
	public double getArea() {
		double area = (2 + (4 / Math.sqrt(2)) * sideLength * sideLength );
		
		return area;
	}
	
	
	/** Return Perimeter */
	@Override
	public double getPerimeter() {
		double perimeter = sideLength * 8;
		
		return perimeter;
	}
	
	
	/** Override Comparable method compareTo*/
	@Override
	public int compareTo(Octagon o) {
		
		if (getArea() > o.getArea()) {
			return 1;
		}
		
		else if (getArea() < o.getArea()) {
				return -1;
		}
		
		else return 0;
	}
	
	
	/** Clone method - Make a clone of an object */
	@Override
	public Object clone() {
		
		try {
			return super.clone();
		}
		
		catch (CloneNotSupportedException ex){
			return null;
		}
		
	}
	
	
} // End Octagon Class
