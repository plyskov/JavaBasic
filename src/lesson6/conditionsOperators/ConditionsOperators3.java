package lesson6.conditionsOperators;

import java.util.Scanner;

public class ConditionsOperators3 {

    public static void main(String[] args) {

        boolean isRain = false;
        boolean isSun = false;

        if (isSun && !isRain){
            System.out.println("Let's go walk without umbrella!");
        } else {
            System.out.println("Stay at home.");
        }

        boolean isCloud = true;

        if (isRain){
            System.out.println("Stay at home.");
        } else if (isSun && !isCloud) {
            System.out.println("Let's go walk without umbrella!");
        } else {
            System.out.println("Let's go walk with umbrella!");
        }

        if (isSun && !isRain) {

        }

    }

}
