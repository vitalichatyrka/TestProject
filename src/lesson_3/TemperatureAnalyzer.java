package lesson_3;

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        welcomeToTemperatureAnalyzerApp();
        System.out.println(analyzeTemperature(inputData().nextInt()));
    }
    public static void welcomeToTemperatureAnalyzerApp() {
        System.out.println("Welcome to TemperatureAnalyzer App");
        System.out.print("Please enter the temperature: ");
    }
    public static String analyzeTemperature(int temperature){
        if (temperature > -5) {
            return "Warm";
        }
        else if (temperature <= -5 && temperature > -20) {
                return "Normal";
            }
        else if (temperature <= -20) {
            return "Cold";
        }
        return "Your date is wrong";

    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
