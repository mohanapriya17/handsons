package handsons3;

import java.util.ArrayList;

public class CourseList {
 ArrayList<Courses> course=new ArrayList<Courses>();
 
 public void insert(Courses courses) {
	 course.add(courses);
 }
 public ArrayList<String> noOfCourse(Double budget){
	 ArrayList<String> courseList=new ArrayList();
	 for(Courses courses:course) {
		 if(budget>=courses.getFee()) {
			 courseList.add(courses.getName()+"_"+(budget/courses.getFee()));
			 
		 }
	 }
	return courseList;
	 
 }
}
