package Chapter_23_Template_Method.sample01;

public class Transfer extends BankTemplateMethod
{
	public void transact()
	{
		System.out.println("转账");		
	}
}