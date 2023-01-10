package Lesson3;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double sum = calculator.sum(5, 25);

        System.out.println("Sum is " + sum);
        System.out.println("Multiplication is " + calculator.mult(3, 6));

    }

}
