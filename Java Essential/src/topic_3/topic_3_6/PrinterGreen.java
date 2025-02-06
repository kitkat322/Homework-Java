package topic_3.topic_3_6;

public class PrinterGreen extends PrinterRed {

    @Override
    public void print(String value){
        super.print(value);
        System.out.println("\u001B[32m" + value + "\u001B[0m");
    }
}
