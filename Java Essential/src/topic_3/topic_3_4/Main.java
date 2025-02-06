package topic_3.topic_3_4;

import java.util.Scanner;

public class Main {
    //    Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас DocumentWorker. У тілі класу створіть три методи openDocument(),
//    editDocument(), saveDocument(). У тілі кожного з методів додайте виведення на екран відповідних рядків: "Документ відкритий",
//    "Правка документа доступна у версії Про", "Збереження документа доступне у версії Про". Створіть похідний клас ProDocumentWorker.
//    Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки: "Документ відредаговано", "Документ збережено у
//    старому форматі, збереження в інших форматах доступне у версії Експерт". Створіть похідний клас ExpertDocumentWorker від базового класу
//    ProDocumentWorker. Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран документ збережений в новому
//    форматі. У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp. Якщо користувач не вводить
//    ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу), якщо користувач ввів номери ключа
//    доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
    public static void main(String[] args) {

        enterWord();
    }


    public static void enterWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишіть: так  - якщо хочете ввести ключ");
        //System.out.println("Або:      ні   - якщо хочете отримати демо версію");
        String confirm = scan.nextLine();
        createDocVersion(confirm);
    }

    public static void createDocVersion(String confirm) {
        String key = confirm;
        switch (key) {
            case "так":
                sayYes();
                break;

            case "ні":
                sayNo();
                break;

            default:
                System.out.println("Спробуйте ще раз!");
                enterWord();
                break;
        }
    }

    public static void sayNo() {
        System.out.println("Вам надано демо доступ до документу");
        DocumentWorker doc3 = new DocumentWorker();
        doc3.openDocument();
        doc3.editDocument();
        doc3.saveDocument();
        enterWord();
    }

    public static void sayYes() {
        String key = askKey();
        switch (key) {
            case "2343456", "4563232", "7831692":
                System.out.println("Вам надано доступ до документу Pro");
                DocumentWorker docUp1 = new ProDocumentWorker();
                docUp1.openDocument();
                //ProDocumentWorker docDown = (ProDocumentWorker) docUp;  //?????
                docUp1.editDocument();
                docUp1.saveDocument();
                enterWord();
                break;

            case "273687236", "3773678572", "3862376":
                System.out.println("Вам надано доступ до документу Expert");
                DocumentWorker docUp2 = new ExpertDocumentWorker();
                docUp2.openDocument();
                docUp2.editDocument();
                docUp2.saveDocument();
                break;

            default:
                System.out.println("Невірний ключ, спробуйте ще раз!");
                sayYes();
                break;
        }
    }

    public static String askKey() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть ключ доступу:");
        String key = scan.nextLine();
        return key;
    }
}
