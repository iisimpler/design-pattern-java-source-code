package Chapter_10_Decorator.sample01;

public final class Car implements Transform
{
	public Car()
	{
		System.out.println("���ν����һ������");
	}
	
	public void move()
	{
		System.out.println("��½�����ƶ���");	
	}
}