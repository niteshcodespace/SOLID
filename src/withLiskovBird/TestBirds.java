package withLiskovBird;

public class TestBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// we upcasting parrot object to parent class we restring parrot  to call parrot class own method
		//Bird parrot = new Parrot(); 
		// it will can call only parrot.fly() 
		//we cannot access parrot.eat()
		//we dont do upcasting fo parrot
		
		Parrot parrot = new Parrot(); 
		Bird penguin = new Penguin();
		
		parrot.eat();
		parrot.fly();
		
		
		penguin.eat();
	}

}
