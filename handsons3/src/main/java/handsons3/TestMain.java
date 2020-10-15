package handsons3;

import java.io.*;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
     ApplicationContext context=new ClassPathXmlApplicationContext("CourseContent.xml");
     CourseList courseList=new CourseList();
     BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
     ArrayList<String> budgetList=new ArrayList<>();
     Courses course1=context.getBean("course1",Courses.class);
     Courses course2 =context.getBean("course2",Courses.class);
     Courses course3=context.getBean("course3",Courses.class);
     System.out.println("Enter your Budget value");
     Double budget=Double.parseDouble(bufferedReader.readLine());
     courseList.insert(course1);
     courseList.insert(course2);
     courseList.insert(course3);
     budgetList =courseList.noOfCourse(budget);
     if(budgetList.isEmpty()) {
    	 System.out.println("No Courses Available");
     }
     else {
    	 for(String values:budgetList) {
    		 System.out.println(values);
    	 }
     }
     
     
	}

}
