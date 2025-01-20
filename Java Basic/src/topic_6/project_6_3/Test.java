package topic_6.project_6_3;

public class Test {
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            for (int g = 0; g < i; g++) {
                System.out.println("g " + g);
            }
            System.out.println("i " + i + "\n");
        }*/


        for (int i = 0; i < 10; i++) {
            for (int g = 0; g <= i; g++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
