package topic_5.topic_5_6;

import java.util.ArrayList;

public class Main {
//    Використовуючи Intelij IDEA, створити проект, пакет. Створити class Main, у ньому створити список, додати вчителів,
//    яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.

    public static void main(String[] args) {

        ArrayList <String> teachers = new ArrayList<>();

        teachers.add("Тетяна Іванівна");
        teachers.add("Ірина Петрівна");
        teachers.add("Ольга Львівна");
        teachers.add("Тамара Петрівна");
        teachers.add("Людмила Олександрівна");

        String bestTeacher = "Ольга Львівна";
        String worstTeacher = "Тамара Петрівна";

        if (teachers.contains(bestTeacher)){
            System.out.println("Індекс найкращого вчителя у списку: " + teachers.indexOf(bestTeacher));
        }

        if (teachers.contains(worstTeacher)){
            System.out.println("Індекс найгіршого вчителя у списку: " + teachers.indexOf(worstTeacher));
        }
    }
}
