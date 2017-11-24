 Singleton（单例）：在单例类的内部实现只生成一个实例，同时它提供一个静态的getInstance()工厂方法，让客户可以访问它的唯一实例；为了防止在外部对其实例化，将其构造函数设计为私有；在单例类内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例。
 
 - 饿汉式单例类
 
 在定义静态变量的时候实例化单例类
 ```
 class EagerSingleton {   
     private static final EagerSingleton instance = new EagerSingleton();   
     private EagerSingleton() { }   
 
     public static EagerSingleton getInstance() {  
         return instance;   
     }     
 }
 ```
 
 - 懒汉式单例类与线程锁定
 
 懒汉式单例在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术，即需要的时候再加载实例，为了避免多个线程同时调用getInstance()方法，我们可以使用关键字synchronized
 
 ```
 class LazySingleton {   
     private static LazySingleton instance = null;   
 
     private LazySingleton() { }   
 
     synchronized public static LazySingleton getInstance() {   
         if (instance == null) {  
             instance = new LazySingleton();   
         }  
         return instance;   
     }  
 }
 ```
 虽然解决了线程安全问题，但是每次调用getInstance()时都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低。无须对整个getInstance()方法进行锁定。
 

 ```
 class LazySingleton {   
     private volatile static LazySingleton instance = null;   
 
     private LazySingleton() { }   
 
     public static LazySingleton getInstance() {   
         //第一重判断  
         if (instance == null) {  
             //锁定代码块  
             synchronized (LazySingleton.class) {  
                 //第二重判断  
                 if (instance == null) {  
                     instance = new LazySingleton(); //创建单例实例  
                 }  
             }  
         }  
         return instance;   
     }  
 }
 ```
  需要注意的是，如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在JDK 1.5及以上版本中才能正确执行。由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。 
  
  懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，但是必须处理好多个线程同时访问的问题，特别是当单例类作为资源控制器，在实例化时必然涉及资源初始化，而资源初始化很有可能耗费大量时间，这意味着出现多线程同时首次引用此类的机率变得较大，需要通过双重检查锁定等机制进行控制，这将导致系统性能受到一定影响。
  
  
- 更好的实现方式

通过Initialization Demand Holder (IoDH)的技术，既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）,这个方案的技术实质是利用Java类初始化的LC锁。在单例类中增加一个静态(static)内部类，在该内部类中创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用。

```java
class Singleton {  
    private Singleton() {  
    }  

    private static class HolderClass {  

            static final Singleton instance = new Singleton();  
            // private final static Singleton instance = new Singleton();  
    }  

    public static Singleton getInstance() {  
        return HolderClass.instance;  
    }  

    public static void main(String args[]) {  
        Singleton s1, s2;   
        s1 = Singleton.getInstance();  
        s2 = Singleton.getInstance();  
        System.out.println(s1==s2);  
    }  
}
```
  
 单例模式的主要缺点如下：
 (1) 由于单例模式中没有抽象层，因此单例类的扩展有很大的困难。
 (2) 单例类的职责过重，在一定程度上违背了“单一职责原则”。因为单例类既充当了工厂角色，提供了工厂方法，同时又充当了产品角色，包含一些业务方法，将产品的创建和产品的本身的功能融合到一起。
 (3) 现在很多面向对象语言(如Java、C#)的运行环境都提供了自动垃圾回收的技术，因此，如果实例化的共享对象长时间不被利用，系统会认为它是垃圾，会自动销毁并回收资源，下次利用时又将重新实例化，这将导致共享的单例对象状态的丢失。
 