package lesson7;

public class ConditionOperatorsExample {

    // Вычислить наибольшее из 3 чисел

    public static void main(String[] args) {
        ThreeNumbersCompare threeNumbersCompare = new ThreeNumbersCompare();

        double parameter1 = threeNumbersCompare.userInputNumbers("Please enter 1st number: ");
        double parameter2 = threeNumbersCompare.userInputNumbers("Please enter 2st number: ");
        double parameter3 = threeNumbersCompare.userInputNumbers("Please enter 3st number: ");

        double checkResult = threeNumbersCompare.compare(parameter1, parameter2, parameter3);

        threeNumbersCompare.printMsg("Max number is " + checkResult);
    }

}
