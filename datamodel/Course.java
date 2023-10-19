package datamodel;

public class Course {
	private String Id;
	private String name;
	private int duration;
	public String getId() {
		return Id;
	}
	public void setId(String string) {
		Id = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
