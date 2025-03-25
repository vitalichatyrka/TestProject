package lesson3;

public class DescendingNumbers {
    public static void main(String[] args) {
        printNegativeSequence();
    }
    public static void printNegativeSequence() {
        for (int num = 0, i = 0; i < 10; i++, num -= 5) {
            System.out.print(num + " ");
        }
        }
    }


