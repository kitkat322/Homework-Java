package topic_1.topic_1_2;

//Завдання 2
// Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Rectangle.
//У тілі класу створити два поля, що описують довжини сторін double side1, double side2. Створити два методи,
//що обчислюють площу прямокутника - double areaCalculator (double side1, double side2) і
//периметр прямокутника - double perimeterCalculator (double side1, double side2).
//Написати програму, яка приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр та площу.

class Rectangle {
    private double side1, side2;


    public Rectangle (){}
    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator (double side1, double side2){
        return side1*side2;
    }
    public double perimeterCalculator (double side1, double side2){
        return 2*(side1+side2);
    }

    public void result(){
        System.out.println("Площа прямокутника = " + areaCalculator(side1, side2));
        System.out.println("Периметр прямокутника = " + perimeterCalculator (side1, side2));
    }

    public void setSide1(double side1){this.side1 = side1;}
    public double getSide1() {return side1;}

    public void setSide2(double side2) {this.side2 = side2;}
    public double getSide2() {return side2;}

}
