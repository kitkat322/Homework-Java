package topic_3.topic_3_1;

public class Main {
    {
        System.out.println("Dynamic bloc Main");
    }

    Main() {
        System.out.println("Main");
    }

    public static void main(String[] args) {
        Cc c = new Cc();
    }
}

class Aa extends Main {
    Aa() {
        System.out.println("Aa");
    }
}

class Bb extends Aa {
    Bb() {
        System.out.println("Bb");
    }
}

class Cc extends Bb {
    Cc() {
        System.out.println("Cc");
    }
}
