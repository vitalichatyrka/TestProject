package lesson_4;
import java.util.Scanner;
import java.util.Random;

public class NumberRemover {
    public static void main(String[] args) {
        welcomeMessage();
        int [] initialArray = initializationOfArray(getRandomInt());
        searchAndRemove(getNumber(),initialArray);
        System.out.println("Initial array:");
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
        }
        public static int getRandomInt (){
            Random random = new Random();
            return random.nextInt(1, 100);
        }
        public static void searchAndRemove(int number, int [] array) {
            int countChangedEllements = 0;
            for (int index = 0;index < array.length; index++) {
                if (array[index] == number) {
                    countChangedEllements++;
                }
            }
            if(countChangedEllements > 0) {
                System.out.println("Were removed " + countChangedEllements + " ellements");
                int [] newArray = new int[array.length - countChangedEllements];
                int index = 0;
                for (int el: array){
                    if(el!=number){
                        newArray[index++] = el;
                    }
                }
                System.out.println("Changed array:");
                printArray(newArray);

            }
            else {
                System.out.println("The array doesn't contain your number");
            }
        }
        public static void printArray(int [] someArray){
                for(int el: someArray){
                    System.out.print(el + "\t");
                }
                System.out.println();
            }
        }





