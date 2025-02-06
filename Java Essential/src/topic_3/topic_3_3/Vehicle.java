package topic_3.topic_3_3;

public class Vehicle {
// Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля:
// координати та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
// Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.

    protected String name;
    protected double price;
    protected int speed, year;

    public Vehicle(){}
    public Vehicle(String name, double price, int speed, int year){
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void showInfo(){
        System.out.println("Інформація про " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Швидкість: " + speed);
        System.out.println("Рік випуску: " + year);
    }
}
