import java.util.Scanner;
public class Prac1bno {
    public static void main(String[] args) {
        try{
            int a=5;
            int b=1;
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("It is the end of the program.");
        }
    }
}
