package Chapter_02_Factory_Method.sample02;

public class HisenseTV implements TV {
    public void play() {
        produceTV();
        System.out.println("���ŵ��ӻ�������......");
    }
    public TV produceTV() {
        System.out.println("���ŵ��ӻ������������ŵ��ӻ���");
        return new HisenseTV();
    }
}