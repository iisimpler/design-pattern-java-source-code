package Chapter_09_Composite.sample02;

//�ı��ļ��ࣺҶ�ӹ���
public class TextFile extends AbstractFile {
    private String name;  

    public TextFile(String name) {  
        this.name = name;  
    }  

    public void add(AbstractFile file) {  
       System.out.println("�Բ��𣬲�֧�ָ÷�����");  
    }  

    public void remove(AbstractFile file) {  
        System.out.println("�Բ��𣬲�֧�ָ÷�����");  
    }  

    public AbstractFile getChild(int i) {  
        System.out.println("�Բ��𣬲�֧�ָ÷�����");  
        return null;  
    }  

    public void killVirus() {  
        //ģ��ɱ��  
        System.out.println("----���ı��ļ�'" + name + "'����ɱ��");  
    }  
}  
