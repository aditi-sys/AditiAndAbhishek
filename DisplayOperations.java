import java.util.ArrayList;

//DisplayOperations Classes inherited from Operations Class
public class DisplayOperations extends Operations{
	
	public DisplayOperations(String name,int id,double percentage,ArrayList<String> skills) {
		super(name,id,percentage,skills);
	}
	
	public DisplayOperations(String name,int id) {
		super(name,id);
	}
	
	//To Display the attributes of the object 
	public void showAttributes() {
		System.out.println("Name : "+getName());
		System.out.println("ID : "+getId());
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Skills : ");
		for(String skill:getSkills()) {
			System.out.print(skill+" ");
		}
		
	}
	
	//To Display Student Name in Upper Case
	public void showNAME() {
		System.out.println(getName().toUpperCase());
	}
	
	//To return Difference between percentage values of two objects
	public double showDifference(Student student) {
		return Math.abs(student.getPercentage()-this.getPercentage());
	}
	
	
}
