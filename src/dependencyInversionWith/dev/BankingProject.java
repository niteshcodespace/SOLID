package dependencyInversionWith.dev;

import java.util.ArrayList;
import java.util.List;

public class BankingProject {

	public static void main(String[] args) {

		Developer forntEnd = new FrontEndDeveloper();
		Developer backEnd = new BackEndDeveloper();

		List<Developer> developer = new ArrayList<Developer>();
		developer.add(backEnd);
		developer.add(forntEnd);
		
		Project project = new Project(developer);
		project.deliverProject();

	}

}
