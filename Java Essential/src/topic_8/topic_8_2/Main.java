package topic_8.topic_8_2;

//    Створити класи:
//1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
//    Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
//Подивитися завдання 2. Перевизначити методи equals & hashCode у кожному класі.
// Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.

public class Main {
    public static void main(String[] args) {

        Device device1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Device device2 = new EthernetAdapter("Samsung", 120, "AB1234567CD", 50, "mac");

        System.out.println(device1);
        System.out.println(device2);

        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());

        System.out.println(device1.equals(device2));

        System.out.println(device1.getClass());
        System.out.println(device2.getClass());



    }
}
