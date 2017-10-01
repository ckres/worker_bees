/**
 * 
 */
package user;

import util.ArrayList;

/**
 * @author Nipunya Khullar
 *
 */
public class Recruiter {
	private String name;
	private Company associatedCompany;
	private ArrayList<Job> jobList;
	private String availibility;
	private String experience;
	private String bio;
	private boolean isOnline;
	
	public Recruiter(String name, Company associatedCompany, ArrayList<Job> jobList, String availibility,
			String experience, String bio, boolean isOnline) {
		super();
		this.name = name;
		this.associatedCompany = associatedCompany;
		this.jobList = jobList;
		this.availibility = availibility;
		this.experience = experience;
		this.bio = bio;
		this.isOnline = isOnline;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Job> getJobList() {
		return jobList;
	}
	public void setJobs(ArrayList<Job> jobList) {
		this.jobList = jobList;
	}
	public String getAvailibility() {
		return availibility;
	}
	public void setAvailibility(String availibility) {
		this.availibility = availibility;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public Company getAssociatedCompany() {
		return associatedCompany;
	}
	public void setAssociatedCompany(Company associatedCompany) {
		this.associatedCompany = associatedCompany;
	}

}
