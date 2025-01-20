package topic_6.project_6_3;

public class Printing_Shapes {
    public static void main(String[] args) {

        /*Завдання 3
Використовуючи IntelliJ IDEA, створіть клас Printing_Shapes.
Використовуючи цикли та метод: System.out.print("*"), System.out.print(" "), System.out.print("\n") (для переходу на новий рядок).
Виведіть на екран:
· прямокутник;
· прямокутний трикутник;
· рівносторонній трикутник;
· ромб.*/

        //прямокутник
        /*for (int i = 0; i < 5; i++){

            for (int a = 0; a < 35; a++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/


        // прямокутний трикутник 1
        /*for (int i = 10; i > 0; i--){         // i - це скільки разів буде повторюватися цикл

            for (int a = i; a < 11; a++){     // а = і - бо нам необхідна певна к-сть зірочок саме в конкретному рядку,
                System.out.print("*");        // тому в другому циклі тут ми вже ставимо таку умову, щоб він міг виконатися лише один раз
            }                                 // вперше, але з кожним повторенням першого циклу, к-сть повторів другого збільшувалась.

            System.out.print("\n");
        }*/

        // прямокутний трикутник 2
        /*for (int i = 0; i < 10; i++){         // i - це скільки разів буде повторюватися цикл

            for (int a = i; a > -1; a--){     // а = і - бо нам необхідна певна к-сть зірочок саме в конкретному рядку,
                System.out.print("*");        // тому в другому циклі тут ми вже ставимо таку умову, щоб він міг виконатися лише один раз
            }                                 // вперше, але з кожним повторенням першого циклу, к-сть повторів другого збільшувалась.

            System.out.print("\n");
        }
*/

        // рівносторонній трикутник
        /*for (int i = 0; i <10; i++){         // i - це скільки разів буде повторюватися цикл

            for (int a = i; a < 10; a++){     // а = і - бо нам необхідна певна к-сть зірочок саме в конкретному рядку,
                System.out.print(" ");        // тому в другому циклі тут ми вже ставимо таку умову, щоб він міг виконатися лише один раз
            }                                 // вперше, але з кожним повторенням першого циклу, к-сть повторів другого збільшувалась.

            System.out.print("*\n");
        }*/


        // рівносторонній трикутник
        /*for (int i = 0; i < 9; i++) {
            for (int g = 9; g > i; g--) {
                System.out.print(" ");
            }
            for (int g = 0; g <= i; g++) {
                System.out.print("*");
            }
            for (int g = 0; g < i; g++) {
                System.out.print("*");
            }
            for (int g = 9; g > i; g--) {
                System.out.print(" ");
            }
            System.out.print("\n");

        }*/



        // ромб
        for (int i = 0; i < 9; i++) {
            for (int g = 8; g > i; g--) {
                System.out.print(" ");
            }
            for (int g = 0; g <= i; g++) {
                System.out.print("*");
            }
            for (int g = 0; g < i; g++) {
                System.out.print("*");
            }
            for (int g = 9; g > i; g--) {
                System.out.print(" ");
            }
            System.out.print("\n");

        }

        for (int i = 9; i > 0; i--) {
            for (int g = 9; g > i; g--) {
                System.out.print(" ");
            }
            for (int g = 1; g < i; g++) {
                System.out.print("*");
            }
            for (int g = 1; g <= i; g++) {
                System.out.print("*");
            }
            for (int g = 9; g > i; g--) {
                System.out.print(" ");
            }
            System.out.print("\n");

        }

    }
}
