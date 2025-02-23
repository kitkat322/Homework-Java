package topic_1.topic_1_3;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене/цвету
    @Override
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int speedComp = this.speed - ((Car)o).speed;
        if (speedComp == 0) {
            int priceComp = this.price - ((Car)o).price;
            if (priceComp == 0) {
                return this.color.compareTo(((Car)o).color);
            } else return priceComp;
        } return speedComp;
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}













