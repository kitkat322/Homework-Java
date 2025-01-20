package topic_2;

public class Project_2_6 {
    public static void main (String[] args) {

        /*
        Завдання 6
Використовуючи IntelliJ IDEA, створіть проект. Створіть необхідну кількість змінних типу char,
кожній змінній надайте значення одного символу у форматі UNICODE. Виведіть у консоль фразу
«Добридень, ВАШЕ_ІМ'Я!».*/

       String d = "Добридень, ";

        char m = 1052;  // 0x041C
        char a = 1072;  // 0x0430
        char r = 1088;  // 0x0440
        char g = 1075;  // 0x0433
        char y = 1080;  // 0x0438
        char t = 1090;  // 0x0442
        char o = 1086;  // 0x043E
        char exclamationMark = 33;

        System.out.print(d);

        System.out.print(m);
        System.out.print(a);
        System.out.print(r);
        System.out.print(g);
        System.out.print(a);
        System.out.print(r);
        System.out.print(y);
        System.out.print(t);
        System.out.print(o);
        System.out.print(exclamationMark);

    }
}
