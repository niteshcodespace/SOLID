package open;

public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AreaCalculator areaCalculator=	new AreaCalculator();
	System.out.println(areaCalculator.areaCalculator(new Square(4)));
	System.out.println(areaCalculator.areaCalculator(new Circle(4)));
	
	}

}
