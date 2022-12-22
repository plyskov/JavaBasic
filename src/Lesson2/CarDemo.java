package Lesson2;

public class CarDemo {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Trunk myTrunk = new Trunk();

        myCar1.model = "BMW";
        myCar1.engine = 2.5;
        myCar1.color = "Black";
        myCar1.gearBoxAuto = true;
        myCar1.trunk = myTrunk;

        Car car2 = new Car();
        car2.model = "Volkswagen";
        car2.engine = 1.8;
        car2.color = "White";
        car2.gearBoxAuto = false;
        car2.trunk = myTrunk;

        System.out.println(myCar1.model);
        myCar1.beep();
        myCar1.go();

        System.out.println(car2.model);
        car2.beep();
        car2.go();

    }

}
