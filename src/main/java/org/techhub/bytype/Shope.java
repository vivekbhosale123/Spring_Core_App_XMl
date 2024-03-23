package org.techhub.bytype;

public class Shope {

	private Producte pro;
	public void setProduct(Producte pro)
	{
       this.pro=pro;
	}
	public void showProduct()
	{
		System.out.println(pro.getId()+"\t"+pro.getName()+"\t"+pro.getPrice());
	}
}
