package topic_8.topic_8_1_3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("1", 12, 1.8F);
        Car car2 = new Car("1", 12, 1.8F);

        Car car3 = new Car("3", 10, 1.6F);
        Car car4 = car1;

        // виведення хеш-кодів
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        System.out.println(car4.hashCode());
    }
}

