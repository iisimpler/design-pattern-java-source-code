package Chapter_01_Simple_Factory.sample03;

public abstract class TV {
    public abstract void play();

    public static TV produceTV(String brand) throws Exception {
        if (brand.equalsIgnoreCase("Haier")) {
            System.out.println("���ӻ����������������ӻ���");
            return new HaierTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            System.out.println("���ӻ������������ŵ��ӻ���");
            return new HisenseTV();
        } else {
            throw new Exception("�Բ����ݲ���������Ʒ�Ƶ��ӻ���");
        }
    }
}