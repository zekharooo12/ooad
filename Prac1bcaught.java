import java.util.Scanner;
public class Prac1bcaught {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("It is the end of the program.");
        }
    }
}