package org.techhub.PracticeApplication.object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.techhub.PracticeApplication.shop;

public class ObjectApplication {

	public static void main(String[] args) {
		    Resource r=new ClassPathResource("pract.xml");
		    BeanFactory bf=new XmlBeanFactory(r);
		    Shop t=(Shop)bf.getBean("sss");
	        t.show();
	}

}
