import java.util.*;

public class Student {

	//Declaring variables
	private String name;
	private int id;
	private double percentage;
	private ArrayList<String> skills;
	
	//Initializing Constructor 1
	public Student(String name,int id,double percentage,ArrayList<String> skills) {
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
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	
	
}
