package topic_6.project_6_9;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(" ");
        }
    }
}
//0 1
//2
//3 4
//5
//6 7
//8
//9
