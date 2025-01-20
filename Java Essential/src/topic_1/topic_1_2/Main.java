package topic_1.topic_1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть перше число");
        double side1 = scan.nextDouble();
        rectangle.setSide1(side1);

        System.out.println("Введіть друге число");
        double side2 = scan.nextDouble();
        rectangle.setSide2(side2);

//        rectangle.perimeterCalculator(side1, side2);
//        rectangle.areaCalculator(side1, side2);

        rectangle.result();

    }
}

