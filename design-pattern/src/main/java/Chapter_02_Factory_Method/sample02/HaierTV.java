package Chapter_02_Factory_Method.sample02;

public class HaierTV implements TV {
    public TV produceTV() {
        System.out.println("�������ӻ����������������ӻ���");
        return new HaierTV();
    }
    public void play() {
        produceTV();
        System.out.println("�������ӻ�������......");
    }
}