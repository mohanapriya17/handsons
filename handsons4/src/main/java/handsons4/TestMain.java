package handsons4;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		CourseList courseList = new CourseList();

		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);

		courseList.insert(course1);
		courseList.insert(course2);
		courseList.insert(course3);
		courseList.discount();
		
		((AbstractApplicationContext) context).close();
		
	}

}
