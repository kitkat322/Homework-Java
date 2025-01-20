package topic_3.topic_3_6;

public class Main {
    public static void main(String[] args) {

        /*
Завдання 6
Використовуючи IntelliJ IDEA, створіть проект із класом main. Створіть дві цілочисельні змінні та виведіть
на екран результати всіх арифметичних операцій над цими двома змінними.
*/

        // перший символ назви класу не може бути символом нижнього регістру, див. Pascal casing;

        int x = 25, y = 8; // byte x = 25, y = 8;

        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        float div = (float) x / y;
        int remain = x % y;
        int powX = (int) Math.pow(x, 2);
        int powY = (int) Math.pow(y, 2);
        float sqX = (float) Math.sqrt(x);
        float sqY = (float) Math.sqrt(y);

        //System.out.println(sum + ", " + sub + ", " + mul + ", " + div + ", " + remain + ", " + powX + ", " + powY + ", " + sqX + ", " + sqY);
        System.out.println("Результат суми: " + sum);
        System.out.println("Результат віднімання: " + sub);
        System.out.println("Результат множення: " + mul);
        System.out.println("Результат ділення: " + div);
        System.out.println("Залишок від ділення: " + remain);
        System.out.println("х в другому степені: " + powX);
        System.out.println("у в другому степені: " + powY);
        System.out.println("Квадратний корінь х: " + sqX);
        System.out.println("Квадратний корінь у: " + sqY);


    }
}
