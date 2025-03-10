package lesson_3;

public class CountdownPrinter {
    public static void main(String[] args) {
        countdown();
    }
    public static void countdown(){
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
