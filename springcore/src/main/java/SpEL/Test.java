package SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con=new ClassPathXmlApplicationContext("SpEL/Configue.xml");
		Demo d=con.getBean("demo",Demo.class);
		System.out.println(d);
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression=temp.parseExpression("22+33");
		System.out.println(expression.getValue());
	}

}
