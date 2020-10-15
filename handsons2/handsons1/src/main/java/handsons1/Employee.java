package handsons1;

import java.util.List;

public class Employee {
private String employeeName;
private List<String> employeeMobileNumber;
private long employeeSalary;
private String emailAddress;
private Address address;
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public List<String> getEmployeeMobileNumber() {
	return employeeMobileNumber;
}
public void setEmployeeMobileNumber(List<String> employeeMobileNumber) {
	this.employeeMobileNumber = employeeMobileNumber;
}
public long getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(long employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(String employeeName, List<String> employeeMobileNumber, long employeeSalary, String emailAddress,
		Address address) {
	super();
	this.employeeName = employeeName;
	this.employeeMobileNumber = employeeMobileNumber;
	this.employeeSalary = employeeSalary;
	this.emailAddress = emailAddress;
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public void display() {
	System.out.println(employeeName);
	System.out.println("The contact Numbers are");
	for(String list:employeeMobileNumber) {
		System.out.println(list);
	}
	System.out.println(employeeSalary);
	System.out.println(emailAddress);
	
}

}
