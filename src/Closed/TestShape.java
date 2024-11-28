package Closed;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalculator areaCalculator = new AreaCalculator();
		System.out.println(areaCalculator.calculateArea(new Circle(4)));
		System.out.println(areaCalculator.calculateArea(new Rectangle(4,5)));

	}

}
