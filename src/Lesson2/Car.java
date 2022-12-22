package Lesson2;

public class Car {

    String model;

    double engine;

    String color;

    Boolean gearBoxAuto;

    Trunk trunk;

    public void beep() {

        System.out.println("This is my " + model + "! BEEP");

    }

    public void go() {

        String textMessage = "Start engine";
        System.out.println(textMessage + " " + engine);

    }
}
