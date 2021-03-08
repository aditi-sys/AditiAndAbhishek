import java.util.*;
//Operations Classes inherited from Student Class
public class Operations extends Student{
	
	public Operations(String name,int id,double percentage,ArrayList<String> skills) {
		super(name,id,percentage,skills);
	}
	
	public Operations(String name,int id) {
		super(name,id);
	}
	
	//Method for changing name by passing value
	public void changeName(String newName) {
		setName(newName);
	}
	
	//Method for changing name by taking value from user
	public void changeName() {
		Scanner in=new Scanner(System.in);
		setName(in.nextLine());
	}
	
	//Method for adding upto 5 skills
	public void addSkill(ArrayList<String> skills) {
		if(skills.size()<=5) {
			ArrayList<String> skillsTemp=getSkills();
			for(String skill:skills) {
				skillsTemp.add(skill);
			}
			setSkills(skillsTemp);
		}
		else
			System.out.println("Adding Skills Faild. Number of Skills are more than 5");
	}
	
}
