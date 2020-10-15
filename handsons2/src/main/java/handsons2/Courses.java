package handsons2;

public class Courses {
private String name,mentor;
private Double fee;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
public Courses() {
	super();
	// TODO Auto-generated constructor stub
}
public Courses(String name, String mentor, Double fee) {
	super();
	this.name = name;
	this.mentor = mentor;
	this.fee = fee;
}


}
