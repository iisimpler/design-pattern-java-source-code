package Chapter_10_Decorator.sample03;

//����װ���ࣺ����װ����
public class ComponentDecorator extends Component
{
       private Component component;  //ά�ֶԳ��󹹼����Ͷ��������

       public ComponentDecorator(Component  component)  //ע����󹹼����͵Ķ���
       {
              this.component = component;
       }

       public void display()
       {
              component.display();
       }
}