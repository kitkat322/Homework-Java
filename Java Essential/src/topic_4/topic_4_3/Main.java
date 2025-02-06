package topic_4.topic_4_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
//    Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створіть 2 інтерфейси Playable та Recodable. У кожному з інтерфейсів
//    створіть по 3 методи void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
//    Створіть похідний клас Player від базових інтерфейсів Playable та Recodable. Написати програму, яка виконує програвання та запис.
public static void main(String[] args) {

    askButtonToPress();

}

public static void askButtonToPress(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Натисніть кнопку");
    System.out.println("\u001b[3m" + "play record pause stop" + "\u001B[0m");
    String button = scan.nextLine();
    buttonsOfPlayer(button);
}

public static void buttonsOfPlayer(String button){
    Player player = new Player();
    switch (button){
        case "play":
            player.play();
            break;

        case "record":
            player.record();
            break;

        case "pause":
            player.pause();
            break;

        case "stop":
            player.stop();
            break;

        default:
            System.out.println("Спробуйте ще раз");
    }

    System.out.println();
    askButtonToPress();
}
}

