
public class Student {
	private String name;
	private int gradYear;
	private double GPA;
	
	public Student() {
		name = "";
		gradYear = 0;
		GPA = 0.0;
	}
	
	public String getName(){
		return name;
	}
	public int getGradYear() {
		return gradYear;
	}
	public double getGPA() {
		return GPA;
	}
	public void setName(String n) {
		name = n;
	}
	public void setGradYear(int n) {
		gradYear = n;
	}
	public void setGPA(double n) {
		GPA = n;
	}
}
