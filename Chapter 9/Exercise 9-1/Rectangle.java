public class Rectangle {

	/** The width and height of the rectangle*/
	double width = 1;
	double height = 1;
	
	/** Construct a rectangle object*/
	Rectangle(){
	}
	
	/** Construct a rectangle object*/
	Rectangle (double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	/** Return are of rectangle*/
	double getArea() {
		return width * height;
	}
	
	/** Return the perimeter of the rectangle*/
	double getPerimeter() {
		return (width * 2) + (height * 2);
	}
	
}
