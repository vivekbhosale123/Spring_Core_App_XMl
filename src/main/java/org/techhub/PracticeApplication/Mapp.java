package org.techhub.PracticeApplication;

import java.util.Map;
import java.util.Set;

public class Mapp {
	Map<Integer,String>map;
	public void setEmployeeList(Map<Integer,String>map)
	{
		this.map=map;
	}
	public void ShowMapp()
	{
		Set<Map.Entry<Integer,String>>set=map.entrySet();
		for(Map.Entry<Integer,String>d:set)
		{
			System.out.println(d.getKey()+"\t"+d.getValue());
		}
	}
}
