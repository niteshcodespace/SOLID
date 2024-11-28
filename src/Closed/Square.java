package Closed;

public class Square implements Shape {

	double side;

	public Square(double side) {
		this.side = side;

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	 

}
