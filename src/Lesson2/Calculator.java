package Lesson2;

public class Calculator {

    public double sum(double x, double y){

        double result = x + y;

        return result;

    }

    public double sub(double x, double y){
        double resultSub = x - y;
        return resultSub;
    }

    public double multiple(double x, double y){
        double resultMultiple = x * y;
        return resultMultiple;
    }

    public double div(double x, double y){
        double resultDiv = x / y;
        return resultDiv;
    }

    public void print(String task, String message){

        System.out.println("Our task is " + task);
        System.out.println(message);
        System.out.println("---------------");

    }

}
