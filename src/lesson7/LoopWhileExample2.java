package lesson7;

import java.util.Scanner;

public class LoopWhileExample2 {

    public static void main(String[] args) {

        boolean condition = true;

        while (condition) {

            menuPrint("Please choose menu number");
            int userInput = userInput();

            switch (userInput){
                case 1:
                    System.out.println("You've chosen Monday");
                    break;
                case 2:
                    System.out.println("You've chosen Wednesday");
                    break;
                case 3:
                    System.out.println("You've chosen Friday");
                    break;
                case 0:
                    System.out.println("Exit...");
                    condition = false;
                    break;
                default:
                    System.out.println("Something went wrong");
            }

        }

        System.out.println("Finish loop while!");

    }

    public static void menuPrint(String message){
        System.out.println(message);
        System.out.println("1. Monday");
        System.out.println("2. Wednesday");
        System.out.println("3. Friday");
        System.out.println("0. Exit");
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }

}
