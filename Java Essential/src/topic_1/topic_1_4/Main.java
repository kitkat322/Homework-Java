package topic_1.topic_1_4;

public class Main {
    public static void main(String[] args) {
        //    Завдання 4
//    Використовуючи IDEA, створіть проект із пакетом. Створити клас Computer, створити масив об'єктів Computers розміром 5.
//    Далі руками створити 5 екземплярів цього класу та записати на комп'ютер (використовуючи loop).

        Computer[] computers = new Computer[5];

        for (int i = 0; i<computers.length; i++){
            Computer computer = new Computer();
            computer.setSerialNum(i);
            computers[i] = computer;
        }

        for (int i = 0; i<computers.length; i++) {
            System.out.println(computers[i].getSerialNum());
        }

    }
}
