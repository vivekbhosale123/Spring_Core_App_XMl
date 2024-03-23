package org.techhub.Collection;

import java.util.List;

public class Company {
    List<String>list;
	public void setEmployeList(List<String>list)
	{
		this.list=list;
	}
	public void showEmployee()
	{
		for(String s:list)
		{
			System.out.println(s);
		}
	}
}
