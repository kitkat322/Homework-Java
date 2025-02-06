package topic_3.topic_3_3;

public class Plane extends Vehicle{
// Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля:
// координати та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
// Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.

    private int altitude;
    private int numberOfPassengers;

    public Plane () {}
    public Plane (String name, double price, int speed, int year, int altitude, int numberOfPassengers){
        super (name, price, speed, year);
        this.altitude = altitude;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Висота: " + altitude);
        System.out.println("К-сть пасажирів: " + numberOfPassengers);
        System.out.println();
    }



}
