package lesson7;

public class TernarOperatorExample {

    public static void main(String[] args) {

        System.out.println(checkNumber(20.0));
        System.out.println(checkNumber(20.555));
        System.out.println(checkNumber(10.0));

        System.out.println(checkNumber2(30.0));
        System.out.println(checkNumber2(10.556));
        System.out.println(checkNumber2(10.0));

    }

    // Если уелое - квартдрат числа, иначе 0
    public static int checkNumber(double number){
        int checkMainPart = (int) (number); // если число 10.0, то результат = 10
                                            // если число 10.8, то результат тоже 10

        double ostatok = number - checkMainPart;
        System.out.println("Ostatok = " + ostatok);

        if (ostatok == 0){
            return checkMainPart * checkMainPart;
        } else {
            return 0;
        }
    }

    public static int checkNumber2(double number){
        int checkMainPart = (int) (number); // если число 10.0, то результат = 10
        // если число 10.8, то результат тоже 10

        double ostatok = number - checkMainPart;
        System.out.println("Ostatok = " + ostatok);

        // Тернарный оператор!
        int resultForReturn = ostatok == 0 ? checkMainPart * checkMainPart : 0;
        return resultForReturn;
    }
}
