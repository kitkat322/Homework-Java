package topic_3.topic_3_6;

public class PrinterPur extends PrinterBlue{

    @Override
    public void print(String value){
        //super.print(value);
        System.out.println("\u001B[35m" + value + "\u001B[0m");
        System.out.println();
    }
}
