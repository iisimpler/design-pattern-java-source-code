package Chapter_10_Decorator.sample03;

class Client
{
       public  static void main(String[] args)
       {
              Component component = new Window(); //������幹��
              Component componentSB = new  ScrollBarDecorator(component); //����װ�κ�Ĺ���
              Component componentBB = new  BlackBorderDecorator(componentSB); //��װ����һ��֮��Ķ������ע�뵽��һ��װ�����У����еڶ���װ��
              componentBB.display();
       }
}