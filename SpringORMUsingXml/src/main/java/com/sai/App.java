package com.sai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.dto.StudentDTO;
import com.sai.service.IStudentService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	IStudentService service = context.getBean(IStudentService.class);
		/*
		 * StudentDTO std = new StudentDTO(); std.setName("sriram"); std.setAge(26);
		 * std.setCity("Hyd"); System.out.println(service.insertStudent(std));
		 */
		/*
		 * System.out.println(service.getStudent(1)); service.deleteById(6);
		 */
    	//service.getAllStudents().forEach(System.out::println);
		/*
		 * StudentDTO std = new StudentDTO(); std.setId(2);
		 * std.setName("Vamsi Krishna"); std.setAge(26); std.setCity("Guntur");
		 * service.updateStudent(std);
		 */
    }
}
