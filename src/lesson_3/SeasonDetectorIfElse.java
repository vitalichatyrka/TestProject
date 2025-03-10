package lesson_3;
import java.util.Scanner;
public class SeasonDetectorIfElse {
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
            return "Incorrect value. You need to enter a value from 1 to 12";
        } else if (numberOfSeason == 12 || numberOfSeason == 1 || numberOfSeason == 2) {
            return "Winter";
        } else if (numberOfSeason >= 3 && numberOfSeason <= 5) {
            return "Spring";
        } else if (numberOfSeason >= 6 && numberOfSeason <= 8) {
            return "Summer";
        } else {
            return "Autumn";
        }

    }
    public static void showSeason(String numberOfSeason) {
        System.out.println(numberOfSeason);
    }
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}





