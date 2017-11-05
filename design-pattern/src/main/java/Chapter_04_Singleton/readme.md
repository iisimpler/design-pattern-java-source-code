 Singleton�����������ڵ�������ڲ�ʵ��ֻ����һ��ʵ����ͬʱ���ṩһ����̬��getInstance()�����������ÿͻ����Է�������Ψһʵ����Ϊ�˷�ֹ���ⲿ����ʵ���������乹�캯�����Ϊ˽�У��ڵ������ڲ�������һ��Singleton���͵ľ�̬������Ϊ�ⲿ�����Ψһʵ����
 
 - ����ʽ������
 
 �ڶ��徲̬������ʱ��ʵ����������
 ```
 class EagerSingleton {   
     private static final EagerSingleton instance = new EagerSingleton();   
     private EagerSingleton() { }   
 
     public static EagerSingleton getInstance() {  
         return instance;   
     }     
 }
 ```
 
 - ����ʽ���������߳�����
 
 ����ʽ�����ڵ�һ�ε���getInstance()����ʱʵ�������������ʱ��������ʵ���������ּ����ֳ�Ϊ�ӳټ���(Lazy Load)����������Ҫ��ʱ���ټ���ʵ����Ϊ�˱������߳�ͬʱ����getInstance()���������ǿ���ʹ�ùؼ���synchronized
 
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
 ��Ȼ������̰߳�ȫ���⣬����ÿ�ε���getInstance()ʱ����Ҫ�����߳������жϣ��ڶ��̸߲߳������ʻ����У����ᵼ��ϵͳ���ܴ�󽵵͡����������getInstance()��������������
 

 ```
 class LazySingleton {   
     private volatile static LazySingleton instance = null;   
 
     private LazySingleton() { }   
 
     public static LazySingleton getInstance() {   
         //��һ���ж�  
         if (instance == null) {  
             //���������  
             synchronized (LazySingleton.class) {  
                 //�ڶ����ж�  
                 if (instance == null) {  
                     instance = new LazySingleton(); //��������ʵ��  
                 }  
             }  
         }  
         return instance;   
     }  
 }
 ```
  ��Ҫע����ǣ����ʹ��˫�ؼ��������ʵ������ʽ�����࣬��Ҫ�ھ�̬��Ա����instance֮ǰ�������η�volatile����volatile���εĳ�Ա��������ȷ������̶߳��ܹ���ȷ�����Ҹô���ֻ����JDK 1.5�����ϰ汾�в�����ȷִ�С�����volatile�ؼ��ֻ�����Java�����������һЩ�����Ż������ܻᵼ��ϵͳ����Ч�ʽ��ͣ���˼�ʹʹ��˫�ؼ��������ʵ�ֵ���ģʽҲ����һ��������ʵ�ַ�ʽ�� 
  
  ����ʽ�������ڵ�һ��ʹ��ʱ����������һֱռ��ϵͳ��Դ��ʵ�����ӳټ��أ����Ǳ��봦��ö���߳�ͬʱ���ʵ����⣬�ر��ǵ���������Ϊ��Դ����������ʵ����ʱ��Ȼ�漰��Դ��ʼ��������Դ��ʼ�����п��ܺķѴ���ʱ�䣬����ζ�ų��ֶ��߳�ͬʱ�״����ô���Ļ��ʱ�ýϴ���Ҫͨ��˫�ؼ�������Ȼ��ƽ��п��ƣ��⽫����ϵͳ�����ܵ�һ��Ӱ�졣
  
  
- ���õ�ʵ�ַ�ʽ

ͨ��Initialization Demand Holder (IoDH)�ļ������ȿ���ʵ���ӳټ��أ��ֿ��Ա�֤�̰߳�ȫ����Ӱ��ϵͳ���ܣ���ʧΪһ����õ�Java���Ե���ģʽʵ�ַ�ʽ����ȱ�����������Ա����������أ��ܶ�����������Բ�֧��IoDH��,��������ļ���ʵ��������Java���ʼ����LC�����ڵ�����������һ����̬(static)�ڲ��࣬�ڸ��ڲ����д������������ٽ��õ�������ͨ��getInstance()�������ظ��ⲿʹ�á�

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
  
 ����ģʽ����Ҫȱ�����£�
 (1) ���ڵ���ģʽ��û�г���㣬��˵��������չ�кܴ�����ѡ�
 (2) �������ְ����أ���һ���̶���Υ���ˡ���һְ��ԭ�򡱡���Ϊ������ȳ䵱�˹�����ɫ���ṩ�˹���������ͬʱ�ֳ䵱�˲�Ʒ��ɫ������һЩҵ�񷽷�������Ʒ�Ĵ����Ͳ�Ʒ�ı���Ĺ����ںϵ�һ��
 (3) ���ںܶ������������(��Java��C#)�����л������ṩ���Զ��������յļ�������ˣ����ʵ�����Ĺ������ʱ�䲻�����ã�ϵͳ����Ϊ�������������Զ����ٲ�������Դ���´�����ʱ�ֽ�����ʵ�������⽫���¹���ĵ�������״̬�Ķ�ʧ��
 