package topic_2.topic_2_2;

public class Main {
    //    Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Машина з полями рік(int), колір(String).
//    Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами. Створити клас Main в якому створити екземпляри,
//    викликаючи різні конструктори.

    public static void main(String[] args) {

        Car model1 = new Car();
        model1.viewInfo();

        Car model2 = new Car("black");
        model2.viewInfo();

        Car model3 = new Car(2005, "red");
        model3.viewInfo();
    }
}
