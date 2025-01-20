package topic_2.topic_2_4;

public class Main {
//    Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int), швидкість(double),
//    вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
//    Перевантажити конструктори викликаючи конструктор із конструктора. Створити клас Main, де створити екземляри класу Машина
//    з різними параметрами.
    public static void main(String[] args) {

    Car model1 = new Car();
    model1.viewInfo();

    Car model2 = new Car("red");
    model2.viewInfo();

    Car model3 = new Car("black", 2003);
    model3.viewInfo();

    Car model4 = new Car("green", 2005, 200);
    model4.viewInfo();

    Car model5 = new Car("pink", 2008, 250, 2100);
    model5.viewInfo();

}


}
