package Chapter_23_Template_Method.sample01;

public class Deposit extends BankTemplateMethod
{
	public void transact()
	{
		System.out.println("存款");		
	}
}