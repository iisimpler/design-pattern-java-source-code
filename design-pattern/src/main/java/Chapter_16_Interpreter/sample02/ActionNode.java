package Chapter_16_Interpreter.sample02;

//�������ͣ��ս�����ʽ
class ActionNode extends AbstractNode {  
    private String action;  

    public ActionNode(String action) {  
        this.action = action;  
    }  

    //�������ƶ���ʽ�����ʽ�Ľ��Ͳ���  
    public String interpret() {  
        if (action.equalsIgnoreCase("move")) {  
            return "�ƶ�";  
        }  
        else if (action.equalsIgnoreCase("run")) {  
            return "�����ƶ�";  
        }  
        else {  
            return "��Чָ��";  
        }  
    }  
}  
