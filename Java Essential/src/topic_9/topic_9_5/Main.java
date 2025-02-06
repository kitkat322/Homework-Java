package topic_9.topic_9_5;

public class Main {
    public static void main(String[] args) {
        MyClass a  = new MyClass();

        MyClass[] classes = new MyClass[3];

        for (int i = 0; i<3; i++){
            classes[i]= a.factoryMethod();
        }

    }
}
