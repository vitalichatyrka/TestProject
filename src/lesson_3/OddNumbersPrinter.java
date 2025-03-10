package lesson_3;

public class OddNumbersPrinter {
    public static void main(String[] args) {
        allOddNumbers();
    }
    public static void allOddNumbers() {
        System.out.print("Print all odd numbers from 1 to 99: ");
        for (int number = 1; number < 100; number++) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }

    }
}