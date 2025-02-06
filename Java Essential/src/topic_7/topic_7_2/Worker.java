package topic_7.topic_7_2;

public class Worker implements Comparable {
//    Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
//  прізвище та ініціали працівника;
//  назва посади;
//  рік надходження на роботу.
//Написати програму, яка виконує такі дії:
//  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
//  якщо значення року введено не у відповідному форматі, видає виняток.
//  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.

    private String name;
    private String position;
    private int yearOfEmployment;

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) throws InvalidYearOfEmploymentException {
        if (!isValidYearOfEmployment(yearOfEmployment)){
            throw new InvalidYearOfEmploymentException ("Некоректний рік початку роботи: " + yearOfEmployment);
        }
        this.yearOfEmployment = yearOfEmployment;
    }

    private boolean isValidYearOfEmployment(int yearOfEmployment){
        if (yearOfEmployment > 1999 && yearOfEmployment < 2025) {
            return true;
        } else return false;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
