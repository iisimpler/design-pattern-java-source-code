package Chapter_20_Observer.sample01;

public class Cat extends MySubject {
    public void cry() {
        System.out.println("è�У�");
        System.out.println("----------------------------");

        for (Object obs : observers) {
            ((MyObserver) obs).response();
        }

    }
}