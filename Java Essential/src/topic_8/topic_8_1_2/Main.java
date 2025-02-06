package topic_8.topic_8_1_2;

public class Main {
    public static void main(String[] args) {
        // створюємо об'єкти, 2 з них містять однакові параметри
        Car car1 = new Car(12);
        Car car2 = new Car(12);
        Car car3 = new Car(15);

        // виведення хеш-кодів за замовчуванням
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
