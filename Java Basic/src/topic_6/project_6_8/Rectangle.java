package topic_6.project_6_8;

public class Rectangle {
    public static void main(String[] args) {

        /*Завдання 8
Використовуючи IntelliJ IDEA, створіть клас Rectangle. Створіть дві цілочислові змінні та задайте їм деякі значення.
Застосовуючи техніку вкладених циклів, намалюйте прямокутник із зірочок.
Використовуйте значення раніше створених змінних для вказівки висоти та ширини прямокутника.
*/
        int width = 22, high = 4;

        for (int i = 0; i<high; i++) {
            for (int a = 0; a<width; ++a) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
