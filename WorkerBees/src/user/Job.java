/**
 * 
 */
package user;

/**
 * @author Madeline
 * @author Cassandra
 *
 */
public class Job {
	/** Holds category of job- eg; service, retail, etc */
	private String category; 
	/** Holds type of job- eg; part time, full time, internship  */
	private String type;
	/** Holds wage of job */
	private int wage; 
	/** holds weekly hours for job */
	private int hours; 
	/** Holds address of job */
	private String address;
	/** Description of job */
	private String description;
	/** If job is still active */
	private boolean isActive;
	
	/** Constructs a job object with given paramaters 
	 * @param String category category of the job
	 * @param String type type of the job
	 * @param int wage wage/salary of the job
	 * @param int hours hours of job
	 * @param String address location of the job
	 * @param String description job description
	 * */
	public Job(String category, String type, int wage, int hours, String address, String description) {
		super();
		this.category = category;
		this.type = type;
		this.wage = wage;
		this.hours = hours;
		this.address = address;
		this.description = description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the wage
	 */
	public int getWage() {
		return wage;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	

}
