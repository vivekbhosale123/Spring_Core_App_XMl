package org.techhub.byname;

public class Shop {

	private Product product;
	public void setProduct(Product product)
	{
       this.product=product;
	}
	public void showProduct()
	{
		System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getPrice());
	}
}
