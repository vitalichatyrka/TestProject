package lesson_5;

import java.util.Scanner;

public class ThreeDimensionalArray {
   private int[][][] array; // Сам массив
   private int depth, rows, cols; // Размеры массива

   public ThreeDimensionalArray(int depth, int rows, int cols) {
      this.depth = depth;
      this.rows = rows;
      this.cols = cols;
      this.array = new int[depth][rows][cols];

      initializeArray();
   }

   private void initializeArray() {
      for (int d = 0; d < depth; d++) {
         for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
               array[d][r][c] = (int) (Math.random() * 10) + 1;
            }
         }
      }
   }

   public void incrementAllElements(int incrementValue) {
      for (int d = 0; d < depth; d++) {
         for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
               array[d][r][c] += incrementValue;
            }
         }
      }
   }

   public void printArray() {
      for (int d = 0; d < depth; d++) {
         System.out.println("Layer " + d + ":");
         for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
               System.out.print(array[d][r][c] + "\t");
            }
            System.out.println();
         }
         System.out.println();
      }
   }
}