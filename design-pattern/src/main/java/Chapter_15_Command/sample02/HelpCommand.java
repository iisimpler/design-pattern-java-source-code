package Chapter_15_Command.sample02;

//���������ࣺ����������
public class HelpCommand extends Command {
    private HelpHandler hhObj; //ά�ֶ���������ߵ�����  

    public HelpCommand() {  
        hhObj = new HelpHandler();  
    }  

    //����ִ�з�������������������ߵ�ҵ�񷽷�  
    public void execute() {  
        hhObj.display();  
    }  
}  