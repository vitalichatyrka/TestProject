package lesson_4;
import java.util.Scanner;
import java.util.Random;

public class NumberRemover {
    public static void main(String[] args) {
        welcomeMessage();
        int [] initialArray = initializationOfArray(getRandomInt());
        searchAndRemove(getNumber(),initialArray);
        System.out.println("Changed array:");
        printArray(initialArray);

    }

    public static int getNumber (){
        System.out.print("Enter the number that you want to find and remove from array:");
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
            System.out.println("Welcome to this app that allows to find you number in the array and delete it");
            System.out.print("Please enter the number what you want to remove from the array: ");
        }
        public static int getRandomInt (){
            Random random = new Random();
            return random.nextInt(1, 100);
        }
        public static void searchAndRemove(int number, int [] array) {
            int countChangedEllements = 0;
            for (int index = 0;index < array.length; index++) {
                if (array[index] == number) {
                    array[index] = 0;
                    countChangedEllements++;
                }
            }
            System.out.println("Were removed " + countChangedEllements + " ellements");
        }
        public static void printArray(int [] someArray){
                for(int el: someArray){
                    System.out.print(el + "\t");
                }
                System.out.println();
            }
        }





