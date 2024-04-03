package Basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		
		Resource resource = new ClassPathResource("appliction.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		//System.out.println(factory);
		
		Ram ram = (Ram)factory.getBean("ram");
		Shayam shayam = (Shayam)factory.getBean("shayam");
		
		ram.eat();
		ram.sleep();
		
		shayam.eat();
		shayam.sleep();
	}
}
