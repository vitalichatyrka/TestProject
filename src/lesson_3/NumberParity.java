package lesson_3;

import java.util.Scanner;

public class NumberParity {
    public static void main(String[] args) {
        welcomeToNumberParityApp();
        System.out.println(checkParity(inputData().nextInt()));
    }
    public static String checkParity(int value) {
        return (value % 2 == 0) ? "Even" : "Odd";
    }
    public static void welcomeToNumberParityApp (){
        System.out.print("Please enter a number: ");
    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
