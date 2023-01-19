package lesson6.lessoncode.conditionsOperators;

import lesson6.lessoncode.staticType.SimpleCalcultor;

import java.util.Scanner;

public class ConditionsOperators {

    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input x value:");
        x = scanner.nextInt();

        if (x > 0){
            System.out.println("x = " + x + " and x > 0");
        } else if (x < 0) {
            System.out.println("x = " + x + " and x < 0");
        } else {
            System.out.println("x = " + x);
        }

    }

}
