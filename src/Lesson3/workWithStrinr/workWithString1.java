package Lesson3.workWithStrinr;

public class workWithString1 {
    public static void main(String[] args) {

        String textOriginal = "     This is sample text    ";
        String text = textOriginal; // Чтобы не потерять исходный текст при переприсвоении.
        //String text2 = new String();

        // Текст - это ОБЪЕКТ, у него есть свои методы!
        System.out.println(text);
        // -----------   получение длины строки  ---------------
        System.out.println("Text length is " + text.length());

        // -------- определяем, содержит ли строка подстроку ----------
        boolean resultContains = text.contains("sample");
        System.out.println("Is text contains our substring? - " + resultContains);

        // Индекс первого вхождения подстроки (не номер, а индекс с 0!)
        System.out.println("Index contains is - " + text.indexOf("sam"));

        System.out.println("Text to upper case: " + text.toUpperCase()); // в верхний регистр
        System.out.println("Text to lower case: " + text.toLowerCase()); // в нижний регистр

        System.out.println(text);
        System.out.println(text.trim()); // Удаление пробелов с начала и конца
        System.out.println(text);
        text = text.trim();
        System.out.println(text);

        System.out.println("------------------------------------------------");

        // ---- дает ответ на вопрос, пустая ли строка
        String textEmpty = "";
        System.out.println("Длина пустой строки: " + textEmpty.length());
        System.out.println("Строка пустая: " + textEmpty.isEmpty());

        System.out.println("------------------------------------------------");

        // ------ получение символов из строки -------
        System.out.println("Length: " + text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(18));
        System.out.println(text.charAt(text.length() - 1));

        // ---- получить часть строки ("кусок" строки)
        String subString1 = text.substring(10);
        System.out.println(subString1);
        String subString2 = text.substring(0, 18);
        System.out.println(subString2);

        // самостоятельно: как заменить один символ на другой.
        // ТУТ должно быть решение

    }
}
