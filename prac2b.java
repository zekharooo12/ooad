import java.util.Scanner;
import java.io.*;
public class prac2b {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(System.out, true);
            System.out.print("Enter a integer: ");
            int a = scan.nextInt();
            pw.println(a);
            System.out.print("Enter a string: ");
            String str = scan.next();
            pw.println(str);
            System.out.print("Enter a float: ");
            float f = scan.nextFloat();
            pw.println(f);
            System.out.print("Enter a boolean: ");
            boolean b = scan.nextBoolean();
            pw.println(b);
            scan.close();
        } catch (Exception e) {
            System.out.println("Enter valid input");
        }
    }
}
