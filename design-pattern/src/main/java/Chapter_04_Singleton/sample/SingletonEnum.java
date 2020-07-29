package Chapter_04_Singleton.sample;

// 唯一能抵御反射破坏单例方式
public class SingletonEnum {

    private SingletonEnum() {
    }

    private enum Holder {
        HOLDER;
        private SingletonEnum instance;

        Holder() {
            this.instance = new SingletonEnum();
        }
    }
    public static SingletonEnum getInstance() {
        return Holder.HOLDER.instance;
    }
}