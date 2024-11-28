package withoutLiskovBird;

public class TestBirds {
	
	
	public static void main(String[] args) {
		
		Bird parrot= new Parrot();
		Bird penguin =new Penguin();
		
		parrot.fly();
		parrot.eat();
		
		penguin.fly(); //Technically  not allow
	}
	
	
	

}
