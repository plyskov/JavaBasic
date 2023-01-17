package lesson5.workWithString;

public class WorkWithString1 {

    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";
        String text1 = "";

        String str1 = " ";

        char symbol = text.charAt(0);

        System.out.println(symbol);
        System.out.println(text.charAt(18));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));

        String subStringNext1 = text.substring(45, 49); // вырезается до (индекс - 1)
        String subStringNext2 = text.substring(0, 10);

        System.out.println(subStringNext1);
        System.out.println(subStringNext2);

    }

}
