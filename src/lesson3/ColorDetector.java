package lesson3;

import java.util.Scanner;

public class ColorDetector {
    public static void main(String[] args) {
        welcomeToColorDetectorApp();
        System.out.println(getColor(inputData().nextInt()));
    }
    public static void welcomeToColorDetectorApp() {
        System.out.println("Welcome to ColorDetector App");
        System.out.print("Please enter the number of color from 1 to 7: ");
    }

    public static String getColor(int numberOfColor) {
        if (numberOfColor < 1 || numberOfColor > 7) {
            return "Invalid color number";
        }
        switch (numberOfColor) {
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Blue";
            case 6:
                return "Light blue";
            case 7:
                return "Blue";
        }
        return "Wrong info";
    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
