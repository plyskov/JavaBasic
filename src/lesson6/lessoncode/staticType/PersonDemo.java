package lesson6.lessoncode.staticType;

import lesson6.lessoncode.staticType.Person;

public class PersonDemo {

    public static void main(String[] args) {

        Person personPetr = new Person();
        Person personOlga = new Person();

        personPetr.name = "Petr";
        personPetr.town = "Dnepr";

        System.out.println("======== Petr ========");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);

        personOlga.name = "Olga";
        personOlga.town = "Kiiv";

        System.out.println("======== Olga ========");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("======== Petr ========");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town); // Петр переехал в Киев! Потому что town - static)

    }

}
