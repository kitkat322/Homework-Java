package topic_5.project_5_6;

public class DeMorganComparison {
    public static void main(String[] args) {

    /*
    Завдання 6
Використовуючи IntelliJ IDEA, створіть клас DeMorganComparison. Використовуючи теорему де Моргана,
перетворіть вихідний вираз A | B на еквівалентний вираз.
Отрицание конъюнкции есть дизъюнкция отрицаний*/

    boolean a = true, b = false;
    boolean c = ! (a || b) == (!a && !b) == ! (a && b) == (!a || !b);

        System.out.println(c);


}
}