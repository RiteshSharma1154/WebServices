package webHelloWorld;

public class University {
	
	private String Name;
	private int YearsOfExblishment;
	private int NumOfProject;
	
	public University ()
	{
		
	}
	
	public University(String name, int yearsOfExblishment, int numOfProject) {
		super();
		Name = name;
		YearsOfExblishment = yearsOfExblishment;
		NumOfProject = numOfProject;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getYearsOfExblishment() {
		return YearsOfExblishment;
	}

	public void setYearsOfExblishment(int yearsOfExblishment) {
		YearsOfExblishment = yearsOfExblishment;
	}

	public int getNumOfProject() {
		return NumOfProject;
	}

	public void setNumOfProject(int numOfProject) {
		NumOfProject = numOfProject;
	}

	@Override
	public String toString() {
		return "University [Name=" + Name + ", YearsOfExblishment=" + YearsOfExblishment + ", NumOfProject="
				+ NumOfProject + "]";
	}
	
	
	
	
	
	

}
