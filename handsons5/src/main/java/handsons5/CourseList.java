package handsons5;

import java.util.ArrayList;

public class CourseList {
ArrayList<Course> course=new ArrayList<>();
public void insert(Course courses) {
	course.add(courses);
}
public double revenge() {
	double revenue=0.0;
	for(Course courseslist:course) {
		revenue+= courseslist.getFee()*0.2*200;
	}
	return revenue;
}
}
