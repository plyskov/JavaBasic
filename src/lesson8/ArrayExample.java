package lesson8;

// Создать массив, размер запросить у пользователя
// Вычислим сумму элементов, найдем минимальное и максимальное значение

public class ArrayExample {
    public static void main(String[] args) {

        InputArray inputArray = new InputArray();
        PrintArray printArray = new PrintArray();
        ArrayOperationsExample arrayOperationsExample = new ArrayOperationsExample();

        int[] workArray = inputArray.userInput();
        //System.out.println("------ after return:");
        //System.out.println(workArray);
        printArray.arrrayPrint("Our working array: ", workArray);

        int sumOfArray = arrayOperationsExample.sumOfArrayElements(workArray);
        int minOfArray = arrayOperationsExample.minOfArrayElements(workArray);
        int maxOfArray = arrayOperationsExample.maxOfArrayElements(workArray);

        System.out.println("Sum of all elements of array is - " + sumOfArray);
        System.out.println("Min element of our array is - " + minOfArray);
        System.out.println("Max element of our array is - " + maxOfArray);

        printArray.arrrayPrint("Our array: ", workArray);
        arrayOperationsExample.checkEvenElements(workArray);
        printArray.arrrayPrint("Our arrayafter check: ", workArray);

    }
}
