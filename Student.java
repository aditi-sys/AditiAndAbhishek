
public class Student {

	//Declaring variables
	private String name;
	private int id;
	private double percentage;
	private String[] skills;
	
	//Initializing Constructor 1
	public Student(String name,int id,double percentage,String[] skills) {
		this.name=name;
		this.id=id;
		this.percentage=percentage;
		this.skills=skills;
	}
	//Initializing Constructor 2
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	
}
