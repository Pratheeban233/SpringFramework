package com.prathi.SpringFramework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
    	
    	//Same Instance will be pointed (singleton)
    	//each time will create different object
 /*   	Alien obj1=(Alien) factory.getBean("alien");
    	obj1.code();
    	obj1.age=18;
    	System.out.println(obj1.age); //18
    	
    	Alien obj2=(Alien) factory.getBean("alien");
    	obj2.code();
      	System.out.println(obj2.age);//18		*/
    	
    	
    	
    	Alien obj=(Alien) factory.getBean("alien");
    	obj.code();
    	System.out.println(obj.getAge()); 
    	//System.out.println(obj.getLaptop());
    
    }
}
