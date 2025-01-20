package topic_2.topic_2_2;

public class Car {

//    Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Машина з полями рік(int), колір(String).
//    Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами. Створити клас Main в якому створити екземпляри,
//    викликаючи різні конструктори.

    private int year;
    private String color;

    public Car() {
        this.year = 2000;
        this.color = "white";
    }

    public Car(String color) {
        this.year = 2002;
        this.color = color;
    }

    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public void viewInfo(){
        System.out.println("Рік моделі: " + getYear());
        System.out.println("Колір моделі: " + getColor() + "\n");
    }


    public void setYear(int year) {this.year = year; }
    public int getYear() {return year; }

    public void setColor(String color) {this.color = color; }
    public String getColor() {return color; }
}
