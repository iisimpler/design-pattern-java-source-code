package Chapter_10_Decorator.sample03;

class Client
{
       public  static void main(String[] args)
       {
              Component component = new Window(); //定义具体构件
              Component componentSB = new  ScrollBarDecorator(component); //定义装饰后的构件
              Component componentBB = new  BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
              componentBB.display();
       }
}