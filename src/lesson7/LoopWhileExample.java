package lesson7;

import java.util.Scanner;

public class LoopWhileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        boolean condition = true;

        while (condition) {

            System.out.println("Please enter two numbers. If you enter first number = 100 - exit");

            System.out.println("Please enter 1st number: ");
            x = scanner.nextInt();

            System.out.println("Please enter 2nd number: ");
            y = scanner.nextInt();

            System.out.println("Add result is - " + (x + y));

            if (x == 100){
                condition = false;
            }

        }

        System.out.println("Finish loop while!");

    }

}
