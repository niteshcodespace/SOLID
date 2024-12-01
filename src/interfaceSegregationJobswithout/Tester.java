package interfaceSegregationJobswithout;

public class Tester implements SoftwareEngineer {

	@Override
	public void doCoding() {
		// TODO Auto-generated method stub

		throw new RuntimeException("I will not do coding");

	}

	@Override
	public void doTesting() {
		// TODO Auto-generated method stub
		System.out.println("I will do testing");

	}

	@Override
	public void doDeployment() {
		// TODO Auto-generated method stub
		System.out.println("I will not do deployment");
	}

}
