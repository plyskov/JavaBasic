package lesson8.ObjectsArray;

import java.util.Arrays;

public class CatsArrayDemo {

    public static void main(String[] args) {

        CatsArrayUtil catsArrayUtil = new CatsArrayUtil();

        int numbersOfCats = 3;

        Cat[] myCats = catsArrayUtil.createCatsArray(numbersOfCats);

        System.out.println("Created array: ");
        System.out.println(Arrays.toString(myCats));

        System.out.println("Please enter data for " + numbersOfCats + " cats:");
        catsArrayUtil.fillCatsArray(myCats);

        System.out.println(myCats);
        System.out.println("-------created array----------");
        System.out.println(Arrays.toString(myCats));



    }
}
