package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ThreeDimensionalArray array3D = new ThreeDimensionalArray(3, 3, 3);

        System.out.println("Исходный массив:");
        array3D.printArray();

        System.out.print("Введите число, на которое нужно увеличить все элементы: ");
        int incrementValue = scanner.nextInt();

        array3D.incrementAllElements(incrementValue);

        System.out.println("\nМассив после увеличения на " + incrementValue + ":");
        array3D.printArray();

        scanner.close();
    }
}


