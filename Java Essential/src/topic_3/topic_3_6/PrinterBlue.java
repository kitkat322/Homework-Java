package topic_3.topic_3_6;

public class PrinterBlue extends PrinterGreen{

    @Override
    public void print(String value){
        super.print(value);
        System.out.println("\u001B[36m" + value + "\u001B[0m");
    }
}
