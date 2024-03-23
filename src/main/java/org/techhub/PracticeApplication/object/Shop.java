package org.techhub.PracticeApplication.object;

public class Shop {

	Product product;
	public void setProduct(Product product)
	{
		this.product=product;
	}
	public void show()
	{
		System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getSal());
	}
}
