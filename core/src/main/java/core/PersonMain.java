package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
  
	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("demo.xml");
//		Person p=new Person();
//		p.display();
		Person p1=ac.getBean(Person.class);
		p1.display();
		
		ApplicationContext ac1 = new AnnotationConfigApplicationContext(Team.class);
		Team t=ac1.getBean(Team.class);
		t.display();
		
	}
}
