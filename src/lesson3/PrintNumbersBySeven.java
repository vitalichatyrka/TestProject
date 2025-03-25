package lesson3;

public class PrintNumbersBySeven {
    public static void main(String[] args) {
        printMultiplesOfSeven();

    }
   public static void printMultiplesOfSeven() {
       int num = 7;
       while (num <= 98) {
           System.out.print(num + " ");
           num += 7;
       }
   }
}

