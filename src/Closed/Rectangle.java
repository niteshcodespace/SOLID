package Closed;

public class Rectangle implements Shape {

	double length;
	double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
