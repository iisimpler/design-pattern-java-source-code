package Chapter_20_Observer.sample03;

//����۲���
interface Observer {
    public String getName();

    public void setName(String name);

    public void help(); //����֧Ԯ���ѷ���  

    public void beAttacked(AllyControlCenter acc); //�������ܹ�������
}  