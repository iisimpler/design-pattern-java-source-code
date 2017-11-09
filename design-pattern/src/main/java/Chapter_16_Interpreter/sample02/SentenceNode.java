package Chapter_16_Interpreter.sample02;

//�򵥾��ӽ��ͣ����ս������ʽ
class SentenceNode extends AbstractNode {  
    private AbstractNode direction;  
    private AbstractNode action;  
    private AbstractNode distance;  

    public SentenceNode(AbstractNode direction,AbstractNode action,AbstractNode distance) {  
        this.direction = direction;  
        this.action = action;  
        this.distance = distance;  
    }  

    //�򵥾��ӵĽ��Ͳ���  
    public String interpret() {  
        return direction.interpret() + action.interpret() + distance.interpret();  
    }     
}  