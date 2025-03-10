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
        switch (numberOfSeason) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Autumn";
            default:
                return "Incorrect value. You need to enter a value from 1 to 12";
        }
    }
    public static void showSeason(String numberOfSeason) {
        System.out.println(numberOfSeason);
    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
