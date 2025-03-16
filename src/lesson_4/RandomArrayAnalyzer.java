package lesson_4;
import java.util.Scanner;
import java.util.Random;

public class  RandomArrayAnalyzer{
    public static void main(String[] args) {
        welcomeMessage();
        int [] array = initializationOfArray(getNumber());
        printArray(array);
        System.out.println("Max value in the array is: " + searchMaxValue(array));
        System.out.println("Min value in the array is: " + searchMinValue(array));
        System.out.println("This is the average value of the array: " + searchAverageValue(array));
    }

    public static int getNumber (){
        System.out.print("Enter the size of the future array:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int [] initializationOfArray (int sizeOfArray) {
        int[] randomArray = new int[sizeOfArray];
        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = getRandomInt();
        }
        return randomArray;
    }
    public static void welcomeMessage () {
        System.out.println("Welcome to this app that allows to get Max, Min and average values of array");
    }
    public static int getRandomInt (){
        return (int) (Math.random() * 99) + 1;
    }
    public static int searchMaxValue(int [] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
        }
    public static int searchMinValue(int [] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static double searchAverageValue(int [] array) {
        int sum = 0;
        for (int num : array) {
          sum += num;
        }
        return (double) sum/array.length;
    }


    public static void printArray(int [] someArray){
        System.out.println("Your array:");
        for(int el: someArray){
            System.out.print(el + "\t");
        }
        System.out.println();
    }
}





