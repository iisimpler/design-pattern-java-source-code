package Chapter_09_Composite.sample02;

//�����ļ��ࣺ���󹹼�
abstract class AbstractFile {  
    public abstract void add(AbstractFile file);  
    public abstract void remove(AbstractFile file);  
    public abstract AbstractFile getChild(int i);  
    public abstract void killVirus();  
}  