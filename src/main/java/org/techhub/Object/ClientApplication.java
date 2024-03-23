package org.techhub.Object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApplication {

	public static void main(String[] args) 
	{
	   Resource r=new ClassPathResource("test.xml");
	   BeanFactory bf=new XmlBeanFactory(r);
	   Shop s=(Shop)bf.getBean("s");
	   s.showProduct();
	}

}
