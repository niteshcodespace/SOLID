package Closed;

public class Circle implements Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	 

}
