package org.techhub.PracticeApplication;

public class shop {

	private Product product;
	public void setShop(Product product)
	{
		this.product=product;
	}
	public void show()
	{
		System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getSal());
	}
}
