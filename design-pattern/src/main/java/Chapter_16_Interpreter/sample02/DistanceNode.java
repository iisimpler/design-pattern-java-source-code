package Chapter_16_Interpreter.sample02;

//������ͣ��ս�����ʽ
class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //������ʽ�Ľ��Ͳ���
    public String interpret() {
        return this.distance;
    }
}  