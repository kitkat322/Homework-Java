package topic_2.topic_2_4;

public class Car {
//    Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int), швидкість(double),
//    вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
//    Перевантажити конструктори викликаючи конструктор із конструктора. Створити клас Main, де створити екземляри класу Машина
//    з різними параметрами.

    private int year, weigt;
    private double speed;
    private String color;

    public Car() {
        this("white", 2000, 180, 2500);
    }

    public Car(String color){
        this(color, 2000, 180, 2500);
    }

    public Car(String color, int year){
        this(color, year, 180, 2500);
    }

    public Car(String color, int year, double speed){
        this(color,year, speed, 2500);
    }

    public Car(String color, int year, double speed, int weigt) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.weigt = weigt;
    }

    public void viewInfo(){
        System.out.println("Колір: " + getColor());
        System.out.println("Рік: " + getYear());
        System.out.println("Швидкість: " + getSpeed());
        System.out.println("Вага: " + getWeigt() + "\n");
    }

    public String getColor(){return color; }
    public int getYear(){return year; }
    public double getSpeed(){return speed; }
    public int getWeigt(){return weigt; }



}
