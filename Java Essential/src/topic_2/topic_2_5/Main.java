package topic_2.topic_2_5;

public class Main {
//    Використовуючи Intelij IDEA, створити проект, пакет. Створити клас MyArea, в ньому оголосити константу PI = 3.14 та
//    статичний метод areaOfCircle, який повинен приймати радіус та використовуючи PI порахувати площу кола.
//    Створити клас Main, де запустити цей метод.

public static void main(String[] args) {

    MyArea cirkleArea = new MyArea();

    double radius = 10;
    double area = cirkleArea.areaOfCircle(radius);

    System.out.println("Площа кола дорівнює: " + area);
}
}
