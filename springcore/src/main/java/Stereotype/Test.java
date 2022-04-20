package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con=new ClassPathXmlApplicationContext("Stereotype/StereoConfigue.xml");
		Student student=(Student)con.getBean("student");
//		System.out.println(student);
//		System.out.println(student.getAddresses());
		
//		
		System.out.println(student.hashCode());
		Student s2=con.getBean("student",Student.class);
		System.out.println(s2.hashCode());
		
		Teacher t1=con.getBean("teacher",Teacher.class);
		Teacher t2=con.getBean("teacher",Teacher.class);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
	}

}
