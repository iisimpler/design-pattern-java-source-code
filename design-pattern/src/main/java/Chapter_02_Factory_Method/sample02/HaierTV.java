package Chapter_02_Factory_Method.sample02;

public class HaierTV implements TV {
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
    public void play() {
        produceTV();
        System.out.println("海尔电视机播放中......");
    }
}