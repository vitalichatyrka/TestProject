package lesson_3;
import java.util.Scanner;
public class SeasonDetector {
    public static void main(String[] args) {
        welcomeToSeasonApp();
        getNumberOfSeason();
    }


    public static void welcomeToSeasonApp() {
        System.out.println("Welcome to season App");
    }
    public static void getNumberOfSeason () {
        System.out.println("Please enter number of season 1-12");
     int numberOfSeason = inputData().nextInt();
      showSeason(convertNumberToMonth(numberOfSeason));
    }
    public static String convertNumberToMonth(int numberOfSeason) {
        if (numberOfSeason < 1 || numberOfSeason > 12) {
            return "Invalid month number";
        }
        return switch (numberOfSeason) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Incorrect value. You need enter value from 1 to 12";
        };
    }
    public static void showSeason(String numberOfSeason) {
        System.out.println(numberOfSeason);
    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
