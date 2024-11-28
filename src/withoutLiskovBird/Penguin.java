package withoutLiskovBird;

public class Penguin extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Penguin cannot fly");
	}
	

}
