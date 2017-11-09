package Chapter_24_Visitor.sample01;

public class Client
{
	public static void main(String a[])
	{
		Product b1=new Book();
		Product a1=new Apple();
		Visitor visitor;
		
        BuyBasket basket=new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(a1);
        
        visitor=(Visitor)XMLUtil.getBean();
        
        visitor.setName("����");
        	
        basket.accept(visitor);
	}
}