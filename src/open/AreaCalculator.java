package open;

public class AreaCalculator {

	public double areaCalculator(Object shape) {
		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			return Math.PI * circle.radius * circle.radius;
		} 
		else {
			Square square = (Square) shape;
			return square.side * square.side;
		}
//throw new IllegalArgumentException("");
}
}