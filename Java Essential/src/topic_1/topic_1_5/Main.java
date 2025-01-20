package topic_1.topic_1_5;

public class Main {
    public static void main(String[] args) {

//        Завдання 5
//        Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Address.
//        У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
//        Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
//        У поля екземпляра записати інформацію про поштову адресу. Виведіть на екран значення полів, що описують адресу.

        Adress adress = new Adress();
        adress.setIndex("25337");
        adress.setCountry("Germany");
        adress.setCity("Elmshorn");
        adress.setStreet("Rethfelder Ring");
        adress.setHouse("52");
        adress.setApartment("3");

        System.out.println("Індекс: " + adress.getIndex());
        System.out.println("Країна: " + adress.getCountry());
        System.out.println("Місто: " + adress.getCity());
        System.out.println("Вулиця: " + adress.getStreet());
        System.out.println("Номер дому: " + adress.getHouse());
        System.out.println("Номер квартири: " + adress.getApartment());
    }
}
