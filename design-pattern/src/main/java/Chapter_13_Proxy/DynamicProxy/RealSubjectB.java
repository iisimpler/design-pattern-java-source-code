package Chapter_13_Proxy.DynamicProxy;

public class RealSubjectB implements AbstractSubject
{	
	public void request()
	{
		System.out.println("��ʵ������B��");
	}
}