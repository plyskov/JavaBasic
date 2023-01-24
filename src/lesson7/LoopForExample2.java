package lesson7;

public class LoopForExample2 {

    public static void main(String[] args) {
        String workString = "For loop example.";

        for (int i = 0; i < workString.length(); i++){
            char actuaSymbol = workString.charAt(i);
            System.out.println(i + " char from our string - " + actuaSymbol);
        }

        System.out.println("-------- now while: -------");

        int counter = 0;

        while (counter < workString.length()){
            char actuaSymbol = workString.charAt(counter);
            System.out.println(counter + " char from our string - " + actuaSymbol);
            counter++;
        }

    }

}
