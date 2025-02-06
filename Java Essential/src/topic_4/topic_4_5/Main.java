package topic_4.topic_4_5;

import java.util.Scanner;

public class Main {
//    Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
//    У класі має бути метод convert, який робить конвертацію.
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Введіть градуси Цельсія:");
    double degreesCelsius = scan.nextInt();

    ConverterTemperature degree = new ConverterTemperature(degreesCelsius);
    degree.convert();
}
}
