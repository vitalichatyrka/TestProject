package lesson3;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        welcomeToNumberSumApp();
        System.out.println("Sum of numbers " + getSum(inputData().nextInt()));
    }
    public static int getSum(int maxNumber) {
        int sumOfNumbers = 0;
        for (int startNumber = 1; startNumber <= maxNumber; startNumber++){
            sumOfNumbers += startNumber;
        }
        return sumOfNumbers;
    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
    public static void welcomeToNumberSumApp() {
        System.out.println("Welcome to NumberSum App");
        System.out.print("Please enter the positive number: ");
    }
}

