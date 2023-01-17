package lesson5.workWithString;

public class WorkWithString2 {

    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String   ";

        System.out.println("Our working text is ->" + text);

        String testString1 = "рабо";

        boolean resultContains = text.contains(testString1);
        System.out.println("Our working text contains result is - " + resultContains);

        System.out.println("Contains word 'Pert' result is - " + text.contains("Pert"));

        String textToUpperCase = text.toUpperCase();
        String textToLowerCase = text.toLowerCase();

        System.out.println("To upper: " + textToUpperCase + "\n" + "To lower: " + textToLowerCase);

        text = text.trim();

        System.out.println(text);

        System.out.println(text.indexOf("метод"));

        System.out.println(text.replace('о', 'а'));

    }

}
