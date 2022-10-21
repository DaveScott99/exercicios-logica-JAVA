package entities;

public class PersonData {

	private double height;
	private char sex;
	
	public PersonData(double height, char sex) {
		
		this.height = height;
		this.sex = sex;
		
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public char getSex() {
		return sex;
	}
	
}
