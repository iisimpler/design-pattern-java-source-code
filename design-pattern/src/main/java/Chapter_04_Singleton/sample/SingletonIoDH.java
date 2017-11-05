package Chapter_04_Singleton.sample;

public class SingletonIoDH {

    private SingletonIoDH() {
    }

    private static class Holder {
        static final SingletonIoDH instance = new SingletonIoDH();
    }
    public static SingletonIoDH getInstance() {
        return Holder.instance;
    }
}