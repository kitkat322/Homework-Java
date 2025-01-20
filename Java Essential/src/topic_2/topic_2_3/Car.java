package topic_2.topic_2_3;

public class Car {
//    Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int), швидкість(double),
//    вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
//    Перевантажити конструктори. Створити клас Main, де створити екземляри класу Машина з різними параметрами.

    private int year, weigt;
    private double speed;
    private String color;

    public Car(){
        this.year = 2000;
        this.color = "black";
        this.speed = 180;
        this.weigt = 2500;
    }

    public Car(int year){
        this.year = year;
        this.color = "black";
        this.speed = 180;
        this.weigt = 2500;
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
        this.speed = 180;
        this.weigt = 2500;
    }

    public Car(int year, String color, double speed){
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weigt = 2500;
    }

    public Car(int year, int weigt, double speed, String color){
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weigt = weigt;


    }

    public int getYear() {return year; }
    public int getWeigt() {return weigt; }
    public double getSpeed() {return speed; }
    public String getColor() {return color; }

    public void viewInfo(){
        System.out.println("Рік: " + getYear());
        System.out.println("Колір: " + getColor());
        System.out.println("Швидкість: " + getSpeed());
        System.out.println("Вага: " + getWeigt() + "\n");
    }


}
