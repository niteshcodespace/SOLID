package withLiskovBird;

public class Parrot  extends FlyingBird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Parrot can fly");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Parrot can eat");
		
	}

}
