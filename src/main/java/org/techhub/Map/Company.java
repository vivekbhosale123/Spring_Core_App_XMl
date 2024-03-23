package org.techhub.Map;

import java.util.Map;
import java.util.Set;

public class Company {
	
    private Map<Integer,String>map;
	public void setEmployee(Map<Integer,String>map)
	{
		this.map=map;
	}
	public void ShowEmployee()
	{
	    Set<Map.Entry<Integer,String>>s=map.entrySet();
	    for(Map.Entry<Integer, String>d:s)
	    {
	    	System.out.println(d.getKey()+"\t"+d.getValue());
	    }
	}
}
