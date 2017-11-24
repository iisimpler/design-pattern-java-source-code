package Chapter_04_Singleton.sample;

public class SingletonLanhan {
    private volatile static SingletonLanhan instance = null;

    private SingletonLanhan() {
    }

    public static SingletonLanhan getInstance() {
        if (instance == null) {
            synchronized (SingletonLanhan.class) {
                if (instance == null) {
                    instance = new SingletonLanhan();
                }
            }

        }
        return instance;
    }
}