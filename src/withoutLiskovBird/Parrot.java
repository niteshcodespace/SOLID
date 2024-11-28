package withoutLiskovBird;

public class Parrot  extends Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		System.out.println("Parrot can fly aroud 10 km");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
	
}
