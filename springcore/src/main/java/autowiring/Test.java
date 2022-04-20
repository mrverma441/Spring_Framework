package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("autowiring/AutowiringConfigue.xml");
        Emp p=(Emp) context.getBean("emp1");
        System.out.println(p);

	}

}
