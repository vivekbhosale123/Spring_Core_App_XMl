package org.techhub.PracticeApplication;

import java.util.List;

public class Collection {

	private List<String>list;
	public void setEmployeeList(List<String>list)
	{
		this.list=list;
	}
	public void ShowList()
	{
		for(String s:list)
		{
		   System.out.println(s);	
		}
	}
}
