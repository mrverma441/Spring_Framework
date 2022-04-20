package stand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con=new ClassPathXmlApplicationContext("stand/StandConfigue.xml");
		beanclass bn=con.getBean("bc",beanclass.class);
		System.out.println(bn);
		System.out.println(bn.getFriends().getClass().getName());
		
		System.out.println("---------------------------");
		System.out.println(bn.getFs());
		System.out.println(bn.getFs().getClass().getName());
		
		
		
		
		System.out.println("-------------------------------");
		System.out.println(bn.getProperties());
		
	}

}
