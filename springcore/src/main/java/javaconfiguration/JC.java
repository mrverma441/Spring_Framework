package javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages="javaconfiguration")
public class JC {

	@Bean(name={"student","temp","con"})
	public Samosa getSamosa()
	{
		return new Samosa();
		
	}
	//@Bean(name={"student","temp","con"})
	@Bean
	public Student getStudent()
	{
		//creating a new student object
		Student student=new Student(getSamosa());
		
		return student;
	}
}
