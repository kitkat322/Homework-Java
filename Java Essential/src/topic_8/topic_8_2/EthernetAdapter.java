package topic_8.topic_8_2;

//    Створити класи:
//1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
//    Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
//Подивитися завдання 2. Перевизначити методи equals & hashCode у кожному класі.
// Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.

public class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac){
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 18 * result + (super.getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 18 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        result = 18 * result + Float.floatToIntBits(getPrice());
        result = 18 * result + speed;
        result = 18 * result + (mac == null ? 0 : mac.hashCode());

        return result;
    }
}
