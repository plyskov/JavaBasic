package lesson8.ObjectsArray;

public class CatsArrayUtil {

    public Cat createCat(){

        InputData inputData = new InputData();

        String catName = inputData.userInputText("Enter cat name");
        String catColor = inputData.userInputText("Enter cat color");
        int catAge = inputData.userInputInt("Enter cat age");

        return new Cat(catName, catColor, catAge);
    }

    public Cat[] createCatsArray(int arraySize){
        Cat[]catsArray = new Cat[arraySize];
        return catsArray;
    }

    public void fillCatsArray(Cat[] catsArray){
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i] = createCat();
        }
    }

}
