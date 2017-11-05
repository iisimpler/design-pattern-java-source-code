package Chapter_03_Abstract_Factory.sample01;

public class HaierFactory implements EFactory {
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}