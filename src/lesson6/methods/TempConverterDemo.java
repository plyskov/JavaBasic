package lesson6.methods;

public class TempConverterDemo {
    public static void main(String[] args) {
        Converter converter = new Converter();

        double temperatureInKelvin = ((int) (100 * converter.converterCelsiumToKelvin(21))) / 100;
        converter.printConverter("Convert temp from ", 21, " Celsium in Kelvin is ", temperatureInKelvin);
    }
}
