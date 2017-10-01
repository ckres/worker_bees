/**
 * 
 */
package user;

import util.ArrayList;

/**
 * @author Nipunya Khullar
 *
 */
public class Applicant {

	private String name;
	private String education;
	private ArrayList<String> skills;
	private String bio;

	
	public Applicant(String name, String education, ArrayList<String> skills, String bio) {
		super();
		this.name = name;
		this.education = education;
		this.skills = skills;
		this.bio = bio;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
}
