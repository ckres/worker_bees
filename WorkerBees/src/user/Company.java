/**
 * 
 */
package user;

import java.util.ArrayList;

import manager.Job;

/**
 * @author Madeline
 *
 */
public class Company {
    
    /** name of the company */
    private String name;
    /** brief description of the company */
    private String description;
    /** link to address of we */
    private String website;
    private String address;
    private String city;
    private String state;
    private ArrayList<Job> jobList;
    
    /**
     * Constructs a company object
     * @param name
     * @param description
     * @param website
     * @param address
     * @param city
     * @param state
     * @param jobList
     */
    public Company(String name, String description, String website, String address, String city, String state,
            ArrayList<Job> jobList) {
        setName(name);
        setDescription(description);
        setWebsite(website);
        setAddress(address);
        setCity(city);
        setState(state);
        setJobList(jobList);
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }
    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * @return the jobList
     */
    public ArrayList<Job> getJobList() {
        return jobList;
    }
    /**
     * @param jobList the jobList to set
     */
    public void setJobList(ArrayList<Job> jobList) {
        this.jobList = jobList;
    }    
}
