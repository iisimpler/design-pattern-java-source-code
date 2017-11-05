package Chapter_04_Singleton.sample;

public class SingletonEhan {
    private static SingletonEhan instance = new SingletonEhan();

    private SingletonEhan() {
    }

    public static SingletonEhan getInstance() {
        return instance;
    }
}