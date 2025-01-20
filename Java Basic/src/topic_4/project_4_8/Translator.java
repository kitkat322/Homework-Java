package topic_4.project_4_8;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        /*Завдання 8
Використовуючи IntelliJ IDEA, створіть клас Translator.
Напишіть програму «Україно-англійський перекладач». Програма знає 10 слів про погоду. Потрібно, щоб користувач вводив слово українською,
а програма давала йому переклад цього слова англійською. Якщо користувач ввів слово, для якого немає перекладу, слід вивести повідомлення,
що такого слова немає.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть слово:");
        String a = scan.next();

        switch (a) {
            case "сонячно":
                System.out.println("сонячно - " + "It’s sunny");
                break;
            case "дощить":
                System.out.println("дощить - " + "It’s rainy");
                break;
            case "холодно":
                System.out.println("холодно - " + "It’s cold");
                break;
            case "спекотно":
                System.out.println("спекотно - " + "It’s hot");
                break;
            case "вітряно":
                System.out.println("вітряно - " + "It’s windy");
                break;
            case "морозно":
                System.out.println("морозно - " + "It’s frosty");
                break;
            case "сніжить":
                System.out.println("сніжить - " + "It’s snowing");
                break;
            case "похмуро":
                System.out.println("похмуро - " + "It’s cloudy");
                break;
            case "туманно":
                System.out.println("туманно - " + "It’s foggy");
                break;
            case "ясно":
                System.out.println("ясно - " + "It’s fine");
                break;
            default:
                System.out.println("Такого слова немає в словнику, спробуйте ввести ще раз");
                break;

        }
    }
}
