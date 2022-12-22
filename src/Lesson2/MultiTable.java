package Lesson2;

public class MultiTable {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        System.out.println("Please input integer number - ");
        int intInput = userInput.inputInt();
        System.out.println("Your number is " + intInput);

        System.out.println("Please input double number - ");
        double doubleInput = userInput.inputDouble();
        System.out.println("Your number is " + doubleInput);

        System.out.println("Please input your string - ");
        String stringInput = userInput.inputString();
        System.out.println("Your string is " + stringInput);
    }
}
