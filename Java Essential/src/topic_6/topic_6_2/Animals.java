package topic_6.topic_6_2;

public enum Animals {
//    Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals, що містить
//    конструктор, який повинен набувати цілого числа (вік тварини), і містити перевантажений метод
//    toString(), який повинен повертати назву екземпляра та вік тварини.

    ELEPHANT(20), GIRAFFE(25), KANGAROO(16), OPOSSUM(1);

    int age;

    Animals(int age) {
        this.age = age;
    }

    public String toString(){
        return "Тварина: " + super.toString() + ", вік: " + age;
    }
}
