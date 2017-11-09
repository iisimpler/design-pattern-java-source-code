package Chapter_16_Interpreter.sample02;

//And���ͣ����ս�����ʽ
class AndNode extends AbstractNode {  
    private AbstractNode left; //And������ʽ  
    private AbstractNode right; //And���ұ��ʽ  

    public AndNode(AbstractNode left, AbstractNode right) {  
        this.left = left;  
        this.right = right;  
    }  

    //And���ʽ���Ͳ���  
    public String interpret() {  
        return left.interpret() + "��" + right.interpret();  
    }  
}  