package Chapter_10_Decorator.sample01;

public class Robot extends Changer
{
	public Robot(Transform transform)
	{
		super(transform);
		System.out.println("��ɻ����ˣ�");
	}
	
	public void say()
	{
		System.out.println("˵����");	
	}
}