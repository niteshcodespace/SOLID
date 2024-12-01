package dependencyInversionWith.dev;

import java.util.List;

public class Project {

	// we need to use such data structure that expand without touching when required
	// expansion
	private List<Developer> developers = null;

//create constructor 
	public Project(List<Developer> developers) {
		this.developers = developers;
	}
// we used for.Each to add Different types of Developer
	public void deliverProject() {
		developers.forEach(Developer::develop);
	}
}
