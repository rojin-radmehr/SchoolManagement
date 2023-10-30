package datamodel;

import java.math.BigInteger;

public class Instructors extends Students {
	private String Id;
	private String name;
	private BigInteger number;
	private String subject;
	private String email;
	private String target_year;
	
	public String getTarget_year() {
		return target_year;
	}
	public void setTarget_year(String target_year) {
		this.target_year = target_year;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BigInteger getNumber() {
		return number;
	}
	public void setNumber(BigInteger number) {
		this.number = number;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
