package lesson4;
import java.util.Scanner;

public class  CompareArrays {
    public static void main(String[] args) {
        welcomeMessage();
        System.out.println("Enter the size of the first array:");
        int[] firstArray = initializationOfArray(getNumber());
        System.out.println("Your first array:");
        printArray(firstArray);

        System.out.println("Enter the size of the second array:");
        int[] secondArray = initializationOfArray(getNumber());
        System.out.println("Your second array:");
        printArray(secondArray);

        System.out.println(compareAverage(searchAverageValue(firstArray), searchAverageValue(secondArray)));
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] initializationOfArray(int sizeOfArray) {
        int[] randomArray = new int[sizeOfArray];
        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = getRandomInt();
        }
        return randomArray;
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to this app that allows to compare averages values of two array");
    }

    public static int getRandomInt() {
        return (int) (Math.random() * 99) + 1;
    }

    public static String compareAverage(double firstValue, double secondValue) {
        if (firstValue == secondValue) {
            return "The averages of the two arrays are equal.";
        } else if (firstValue > secondValue) {
            return "The average of the first array is bigger than the average of the second array.";
        } else  {
        return "The average of the second array is bigger than the average of the first array.";
        }
    }
        public static double searchAverageValue ( int[] array){
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }
        public static void printArray ( int[] someArray){
            for (int el : someArray) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }

}





