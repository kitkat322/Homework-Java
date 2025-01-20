package topic_2.topic_2_3;

public class Main {
//    Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int), швидкість(double),
//    вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
//    Перевантажити конструктори. Створити клас Main, де створити екземляри класу Машина з різними параметрами.
public static void main(String[] args) {

    Car model1 = new Car();
    model1.viewInfo();

    Car model2 = new Car(2001);
    model2.viewInfo();

    Car model3 = new Car(2002, "white");
    model3.viewInfo();

    Car model4 = new Car(2003, "yellow", 220);
    model4.viewInfo();

    Car model5 = new Car(2004, 2400, 240, "red");
    model5.viewInfo();

}
}
