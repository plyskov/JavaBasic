package lesson6.lessoncode.methods;

public class Converter {

    public double converterCelsiumToKelvin(double temperatureInCelsium){
        double temperatureInKelvin = temperatureInCelsium - 273.15;
        return temperatureInKelvin;
    }

    public double converterCelsiumFarengeight(double temperatureInCelsium){
        double temperatureInFarengeight = temperatureInCelsium * 1.38 + 32;
        return temperatureInFarengeight;
    }

    public void printConverter(String messageC, double tempC, String messageNew, double tempNew){
        System.out.println(messageC + tempC + messageNew + tempNew);
    }

}
