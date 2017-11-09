package Chapter_20_Observer.sample03;

//ս�ӳ�Ա�ࣺ����۲�����
class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //֧Ԯ���ѷ�����ʵ��  
    public void help() {
        System.out.println("���ס��" + this.name + "�����㣡");
    }

    //���ܹ���������ʵ�֣������ܹ���ʱ������ս�ӿ����������֪ͨ����notifyObserver()��֪ͨ����  
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "��������");
        acc.notifyObserver(name);
    }
}  