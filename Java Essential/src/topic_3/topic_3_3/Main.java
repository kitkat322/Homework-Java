package topic_3.topic_3_3;

import topic_3.topic_3_3.Car;

public class Main {
    // Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля:
// координати та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
// Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
    public static void main(String[] args) {

        Vehicle plane1 = new Plane("літак" ,20, 500, 2000, 10000, 100);
        Vehicle car1 = new Car("авто", 10, 220, 2004, "white");
        Vehicle ship1 = new Ship("корабель", 35, 80, 2018, "Odessa", 25);
        Vehicle[] vehicles = {plane1, car1, ship1};

        for (Vehicle i : vehicles){
            i.showInfo();
        }
    }
}
