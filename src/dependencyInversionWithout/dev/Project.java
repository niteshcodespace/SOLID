package dependencyInversionWithout.dev;

public class Project {

	// define variable of class type as below FrontEndDeveloper and BackEndDeveloper
	private FrontEndDeveloper fed;
	private BackEndDeveloper bed;

// create the constuctor of Project and assign both the varaible define to to local variable using "this"
	public Project(FrontEndDeveloper fed, BackEndDeveloper bed) {
		this.bed = bed;
		this.fed = fed;
	}

	// we have requirement of have deliverProject() we call backend and frontend
	// related methods

	public void deliverProject() {
		fed.frontEndDeveloper();
		bed.backEndDeveloper();
	}
}
