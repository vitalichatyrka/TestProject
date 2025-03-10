package lesson_3;

public class SquareNumbersPrinter {
    public static void main(String[] args) {
        printSquares();
    }
    public static void printSquares() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}
