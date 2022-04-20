package ambiguity;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructor_Injection.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ambiguity/Configue.xml");
        Addition p=(Addition) context.getBean("add");

        p.doSum();
	}

}
