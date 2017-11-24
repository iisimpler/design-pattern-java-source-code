package Chapter_02_Factory_Method.sample02;

public class HisenseTV implements TV {
    public void play() {
        produceTV();
        System.out.println("海信电视机播放中......");
    }
    public TV produceTV() {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}