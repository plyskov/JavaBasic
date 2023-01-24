package lesson7;

import java.util.Scanner;

public class ThreeNumbersCompare {

    public double userInputNumbers(String message){
        double userInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        userInput = scanner.nextDouble();
        return userInput;
    }

    public void printMsg(String message){
        System.out.println("------------");
        System.out.println(message);
    }

    public double compare(double number1, double number2, double number3){
        double compareResult = 0;

        if ((number1 >= number2) && (number1 >= number3))
            compareResult = number1;

        if ((number2 >= number1) && (number2 >= number3))
            compareResult = number2;

        if ((number3 >= number1) && (number3 >= number2))
            compareResult = number3;

        return compareResult;

    }
}
