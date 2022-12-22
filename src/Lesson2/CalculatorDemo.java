package Lesson2;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double param1 = 25.5;
        double param2 = 5.0;

        // ------------------ Variant 1 -------------------------

        // Sum
        double sumResult = calculator.sum(param1, param2);
        System.out.println("Sum result is " + sumResult);

        // Substraction
        double subresult = calculator.sub(param1, param2);
        System.out.println("Substraction result is " + subresult);

        // Multiply
        double multresult = calculator.multiple(param1, param2);
        System.out.println("Multiplication result is " + multresult);

        // Division
        double divResult = calculator.div(param1, param2);
        System.out.println("Division result is " + divResult);

        System.out.println(" ----------- variant 2 ------------------");

        // ------------------ Variant 2 -------------------------

        calculator.print("Sum","Sum result is " + calculator.sum(param1, param2));
        calculator.print("Substraction","Substraction result is " + calculator.sub(param1, param2));
        calculator.print("Multiplication","Multiplication result is " + calculator.multiple(param1, param2));
        calculator.print("Division","Division result is " + calculator.div(param1, param2));

    }
}
