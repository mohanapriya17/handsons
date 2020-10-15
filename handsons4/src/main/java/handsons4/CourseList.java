package handsons4;

import java.util.ArrayList;

public class CourseList {
ArrayList<Course> courseList=new ArrayList<Course>();

public void insert(Course course) {
	courseList.add(course);
	
}
public void discount() {
	double highest=0;
	double lowest=9999;
	String highestName=null;
	String lowestName=null;
	for(Course course:courseList) {
		if(course.getFee()>highest) {
			highest=course.getFee();
			highestName=course.getName();
		}
		else if(course.getFee()<lowest) {
			lowest=course.getFee();
			lowestName=course.getName();
		}
		
		
	}
	System.out.println("Discount "+highestName+"is"+highest);
	System.out.println("Discount"+lowestName+"is"+lowest);
}
}
