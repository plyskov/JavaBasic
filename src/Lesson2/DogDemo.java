package Lesson2;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Tuzik";
        dog1.age = 10;

        Dog dog2 = new Dog();

        dog2.name = "Bobik";
        dog2.age = 8;

        System.out.println("My first dog name " + dog1.name + " and age " + dog1.age);
        System.out.println("My second dog name " + dog2.name + " and age " + dog2.age);

    }
}
