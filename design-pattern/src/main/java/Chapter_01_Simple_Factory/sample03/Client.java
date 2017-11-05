package Chapter_01_Simple_Factory.sample03;

public class Client {
    public static void main(String[] args) {
        try {
            TV tv;
            String brandName = XMLUtilTV.getBrandName();
            tv = TV.produceTV(brandName);
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
