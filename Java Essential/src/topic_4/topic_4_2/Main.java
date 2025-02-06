package topic_4.topic_4_2;

import java.util.Scanner;

public class Main {
    //    Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас AbstractHandler. У тілі класу створити
//    void open(), void create(), void change(), void save(). Створити похідні класи XMLHandler, TXTHandler, DOCHandler
//    від базового класу AbstractHandler. Написати програму, яка виконуватиме визначення документа і для кожного формату
//    мають бути методи відкриття, створення, редагування, збереження певного формату документа.
    public static void main(String[] args) {

        askDocType();
    }

    public static void askDocType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("З яким документом хочете попрацювати - DOC, TXT чи XML?");
        System.out.println("\u001b[3m" + "*Введіть відповідний тип*" + "\u001B[0m");
        String docType = scan.nextLine();
        applyingHandler(docType);
    }


    public static void applyingHandler(String docType) {
        AbstractHandler handler;
        switch (docType) {
            case "DOC", "doc":
                handler = new DOCHandler();
                handler.create();
                handler.open();
                handler.change();
                handler.save();
                break;

            case "TXT", "txt":
                handler = new TXTHandler();
                handler.create();
                handler.open();
                handler.change();
                handler.save();
                break;

            case "XML", "xml":
                handler = new XMLHandler();
                handler.create();
                handler.open();
                handler.change();
                handler.save();
                break;

            default:
                System.out.println("Невірний формат документа. Спробуйте ще раз.");
                System.out.println();
                askDocType();
        }
    }
}
