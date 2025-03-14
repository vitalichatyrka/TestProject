package lesson_4;
import java.util.Scanner;
import java.util.Random;

public class FindNumberInArray {
    public static void main(String[] args) {
        welcomeMessage();
        System.out.println("Your number is in the random array: " + checkNumberInArray(getNumber().nextInt(), initializationOfArray()));;
    }
     public static int [] initializationOfArray() {
         int[] randomArray = new int[getRandomInt()];
         for (int index = 0; index <randomArray.length; index++) {
             randomArray[index] = getRandomInt();
       //      System.out.print(randomArray[index] + "\t");

         }
         printArray(randomArray);
         return randomArray;
     }
    public static Scanner getNumber(){
        return new Scanner(System.in);
    }

    public static boolean checkNumberInArray(int someNumber, int [] someArray){
for (int element: someArray) {
    if (element == someNumber){
        return true;
    }

}
        return false;
    }
    public static int getRandomInt(){
        Random random  = new Random();
       return random.nextInt(100);
    }
    public static void welcomeMessage(){
        System.out.println("Welcome to this app that allows to find you number in the array");
        System.out.print("Please enter the number what you want to check: ");
    }
    public static void printArray(int [] someArray){
        for(int el: someArray){
            System.out.print(el + "\t");
        }
        System.out.println();
    }
}
