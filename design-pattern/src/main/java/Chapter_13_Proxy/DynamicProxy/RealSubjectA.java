package Chapter_13_Proxy.DynamicProxy;

public class RealSubjectA implements AbstractSubject
{	
	public void request()
	{
		System.out.println("��ʵ������A��");
	}
}