package topic_4.topic_4_5;

public class ConverterTemperature {

    double degreesCelsius;
    double degreeKelvin;
    double degreesFahrenheit;

    public ConverterTemperature(double degreesCelsius){
        this.degreesCelsius = degreesCelsius;
    }

    public void convert(){
        degreeKelvin = degreesCelsius+273.15;
        degreesFahrenheit = degreesCelsius*9/5+32;
        System.out.println("Температура по Кельвіну = " + degreeKelvin + " К");
        System.out.println("Температура по Фарингейту = " + degreesFahrenheit + " F");
    }
}
