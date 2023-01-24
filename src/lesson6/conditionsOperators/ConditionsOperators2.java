package lesson6.conditionsOperators;

import java.util.Scanner;

public class ConditionsOperators2 {

    public static void main(String[] args) {

        int x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input x value:");
        x = scanner.nextInt();

        if (x > 0 && x <= 100){
            System.out.println("x = " + x + " and x is between 0 and 100");
        } else if (x > 100 && x <= 200) {
            System.out.println("x = " + x + " and x is between 101 and 200");
        } else {
            System.out.println("x is out of range");
        }

        if (x < 0 || x > 200) {
            System.out.println("x = " + x + " and x is less 0 or more than 200");
        }

         if (x != 0){
            System.out.println("x is NOT ZERO");
        }

         if (!(x > 0)){
             System.out.println("x - less or equal zero");
         }

    }

}
