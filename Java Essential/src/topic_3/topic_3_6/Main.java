package topic_3.topic_3_6;

public class Main {
//    Створити клас Printer. У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
//    Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу їх екземпляра,
//    рядки, передані як аргументи методів, виводилися різними кольорами. Обязательно используйте приведення типів. ANSI-коды
public static void main(String[] args) {
    String hello = "Hello";

    Printer print = new Printer();
    Printer printRed = new PrinterRed();
    Printer printGreen = new PrinterGreen();
    Printer printBlue = new PrinterBlue();
    Printer printPur = new PrinterPur();

//    print.print(hello);
//    printRed.print(hello);
//    printGreen.print(hello);
//    printBlue.print(hello);
    printPur.print(hello);
}
}
