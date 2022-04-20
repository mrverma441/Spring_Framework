package auto2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("auto2/AutowiringConfigue.xml");
        Emp p=(Emp) context.getBean("emp1");
        System.out.println(p);
	}
}
