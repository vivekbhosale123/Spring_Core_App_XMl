package org.techhub.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.techhub.autodetect.Shop;

public class ClientApplication {
	public static void main(String[] args) 
	{
		   Resource r=new ClassPathResource("test.xml");
		   BeanFactory bf=new XmlBeanFactory(r);
		   singleton t=(singleton)bf.getBean("tt");
		   singleton t1=(singleton)bf.getBean("tt");
		   singleton t2=(singleton)bf.getBean("tt");
		   singleton t3=(singleton)bf.getBean("tt");
	}

}
