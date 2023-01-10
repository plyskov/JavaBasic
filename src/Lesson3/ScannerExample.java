package Lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input integer number ");
        int integerInput = input.nextInt();

        System.out.println("Your int number is " + integerInput);


        System.out.println("Input double number ");
        double doubleInput = input.nextDouble();

        System.out.println("Your double number is " + doubleInput);

        // Боремся с символом перевода строки, оставшемся в буфере после предыдущего ввода double числа
        input.nextLine();

        // После ввода предыдущего числа в буфере останется знак перевода строки, поэтому срау запрос строки не сработает, проскочит.
        System.out.println("Input text ");
        String stringInput = input.nextLine();

        System.out.println("Your text is " + stringInput);

    }
}
