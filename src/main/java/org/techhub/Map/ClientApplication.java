package org.techhub.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApplication {

	public static void main(String[] args)
	{
	   Resource r=new ClassPathResource("test.xml");
	   BeanFactory bf=new XmlBeanFactory(r);
	   Company c=(Company)bf.getBean("m");
	   c.ShowEmployee();
	}

}
