package lesson5;

public class RobotDemo {

    public static void main(String[] args) {

        // сщздаем экземпляр класса Робот
        Robot robotPetya = new Robot();

        // Печатаем значение, которое ханится в нашей переменной - ссылку
        System.out.println(robotPetya);

        // записываем значений в поля экземпляра класса ПЕТЯ
        robotPetya.robotName = "Petya";
        robotPetya.model = 25;
        robotPetya.isPainter = true;

        // Обращаемся к методам экземпляра класса ПЕТЯ
        robotPetya.hello();
        robotPetya.greetings();

        // Создаем экземпляр класса с помощью нашего конструктора
        Robot robotSiri = new Robot("Siri", 5, false);
        // Обращаемся к методам экземпляра класса СИРИ
        robotSiri.greetings();

        // Меняем значение в переменной экземпляра класса СИРИ
        robotSiri.model = 7;

        // Обращаемся к методу экземпляра класса СИРИ
        robotSiri.greetings();

        robotPetya.speak("I am very glad to see you!");
        robotSiri.speak("Me too!");
        robotPetya.speak("I'm so tired!");

        System.out.println(robotPetya.id);
        System.out.println(robotPetya.id.isEmpty());

    }
}
