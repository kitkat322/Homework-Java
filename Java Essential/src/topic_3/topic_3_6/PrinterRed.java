package topic_3.topic_3_6;

public class PrinterRed extends Printer{

    @Override
    public void print(String value){
        super.print(value);
        System.out.println("\u001B[31m" + value + "\u001B[0m");
    }
}
