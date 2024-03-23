package org.techhub.autodetect;

public class Shop {

	private Producty produ;
	public Shop(Producty produ)
	{
       this.produ=produ;
	}
	public void showProduct()
	{
		System.out.println(produ.getId()+"\t"+produ.getName()+"\t"+produ.getPrice());
	}
}
