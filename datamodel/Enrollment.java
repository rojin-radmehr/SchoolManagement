package datamodel;

import java.util.Date;

public class Enrollment {
	private int Id;
	private String details;
	private String requirements;
	private Date date;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
