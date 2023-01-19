package lesson6.lessoncode.methods;

import lesson6.lessoncode.methods.Converter;

public class TempConverterDemo {
    public static void main(String[] args) {
        Converter converter = new Converter();

        double temperatureInKelvin = ((int) (100 * converter.converterCelsiumToKelvin(21))) / 100;
        converter.printConverter("Convert temp from ", 21, " Celsium in Kelvin is ", temperatureInKelvin);
    }
}
