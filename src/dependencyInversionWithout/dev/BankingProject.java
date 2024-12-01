package dependencyInversionWithout.dev;

public class BankingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the object of all class
		FrontEndDeveloper fed = new FrontEndDeveloper();
		BackEndDeveloper bed = new BackEndDeveloper();
		
		//created object of Project and pass BackEndDeveloper and FackEndDeveloper  object 
		Project project = new Project(fed, bed);
		
		//call the deliveryProject
		project.deliverProject();
	}

}
