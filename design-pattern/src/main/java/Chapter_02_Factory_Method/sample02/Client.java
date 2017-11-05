package Chapter_02_Factory_Method.sample02;


public class Client {
    public static void main(String args[]) {
        try {
            TV tv = (TV) XMLUtil.getBean();
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
