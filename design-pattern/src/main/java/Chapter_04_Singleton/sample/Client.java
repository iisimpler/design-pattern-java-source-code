package Chapter_04_Singleton.sample;

public class Client {
    public static void main(String a[]) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);

        SingletonEhan s3 = SingletonEhan.getInstance();
        SingletonEhan s4 = SingletonEhan.getInstance();
        System.out.println(s3 == s4);

        SingletonLanhan s5 = SingletonLanhan.getInstance();
        SingletonLanhan s6 = SingletonLanhan.getInstance();
        System.out.println(s5 == s6);

        SingletonIoDH s7 = SingletonIoDH.getInstance();
        SingletonIoDH s8 = SingletonIoDH.getInstance();
        System.out.println(s7 == s8);
    }
}