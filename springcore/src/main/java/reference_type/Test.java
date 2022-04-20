package reference_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import collection.Emp;

public class Test {

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("reference_type/Ref_Configue.xml");
        A a=(A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
        System.out.println(a);
        
	}

}
