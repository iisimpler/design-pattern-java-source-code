package Chapter_15_Command.sample02;

//��С�������ࣺ����������
public class MinimizeCommand extends Command {
    private WindowHanlder whObj; //ά�ֶ���������ߵ�����  

    public MinimizeCommand() {  
        whObj = new WindowHanlder();  
    }  

//����ִ�з�������������������ߵ�ҵ�񷽷�  
    public void execute() {  
        whObj.minimize();  
    }  
}  