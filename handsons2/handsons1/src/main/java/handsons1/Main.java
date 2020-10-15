package handsons1;

import java.io.IOException;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      Employee employeecontext= context.getBean(Employee.class,"employeecontext");
      employeecontext.display();
      Address address=employeecontext.getAddress();
      address.display();
    
	}

}
