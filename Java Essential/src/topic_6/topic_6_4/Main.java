package topic_6.topic_6_4;

public class Main {
    public static void main(String[] args) {
//    Створіть проект за допомогою IntelliJ IDEA. Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
//    який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(), який повертає рядок з кольором автомобіля,
//    і містити перевантажений метод toString(), який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.

        Vehicles car1 = Vehicles.AUDI;
        Vehicles car2 = Vehicles.BMW;
        Vehicles car3 = Vehicles.MERCEDES;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
