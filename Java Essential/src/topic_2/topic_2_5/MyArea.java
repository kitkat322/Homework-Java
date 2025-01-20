package topic_2.topic_2_5;

public class MyArea {
//    Використовуючи Intelij IDEA, створити проект, пакет. Створити клас MyArea, в ньому оголосити константу PI = 3.14 та
//    статичний метод areaOfCircle, який повинен приймати радіус та використовуючи PI порахувати площу кола.
//    Створити клас Main, де запустити цей метод.

    private static final double PI = 3.14;

    public MyArea(){}

    public static double areaOfCircle(double radius){
        double area = radius * radius * PI;
        return area;
    }

}
