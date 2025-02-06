package topic_8.topic_8_1_1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        // виведення хеш-кодів за замовчуванням
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
