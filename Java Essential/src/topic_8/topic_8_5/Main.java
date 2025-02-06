package topic_8.topic_8_5;

//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
// У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
// У класі Animal перевизначити методи equals & hashCode.

public class Main {
    public static void main(String[] args) {

        Animal cat1 = new Animal("Васька", 45, false);
        Animal cat2 = new Animal("Барсік", 13, true);
        Animal cat3 = new Animal("Барсік", 13, true);
        Animal cat4 = cat1;

        System.out.println("cat1: " + cat1);
        System.out.println("cat2: " + cat2);
        System.out.println("cat3: " + cat3);
        System.out.println("cat4: " + cat4);
        System.out.println("================");
        System.out.println("cat1.equals(cat2) = " + cat1.equals(cat2));
        System.out.println("cat2.equals(cat3) = " + cat2.equals(cat3));
        System.out.println("cat3.equals(cat4) = " + cat3.equals(cat4));
        System.out.println("cat1.equals(cat4) = " + cat1.equals(cat4));
        System.out.println("================");
        System.out.println("cat1.hashCode() = " + cat1.hashCode());
        System.out.println("cat2.hashCode() = " + cat2.hashCode());
        System.out.println("cat3.hashCode() = " + cat3.hashCode());
        System.out.println("cat4.hashCode() = " + cat4.hashCode());

    }
}
