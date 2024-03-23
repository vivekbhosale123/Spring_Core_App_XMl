package org.techhub.PracticeApplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClassApplication {

	public static void main(String[] args) {
	    Resource r=new ClassPathResource("pract.xml");
	    BeanFactory bf=new XmlBeanFactory(r);
	    shop t=(shop)bf.getBean("s");
        t.show();
	}

}
