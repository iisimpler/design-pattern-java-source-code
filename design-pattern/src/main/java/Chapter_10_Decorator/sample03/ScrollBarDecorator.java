package Chapter_10_Decorator.sample03;

//������װ���ࣺ����װ����
public class ScrollBarDecorator extends  ComponentDecorator
{
       public ScrollBarDecorator(Component  component)
       {
              super(component);
       }

       public void display()
       {
              this.setScrollBar();
              super.display();
       }

       public  void setScrollBar()
       {
              System.out.println("Ϊ�������ӹ�������");
       }
}
