import java.util.*;
public class prac1a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int x=0,y=0;
        try
        {
        System.out.print("Enter First Integer : ");
        x=sc.nextInt();
        System.out.print("Enter Second Integer : ");
        y=sc.nextInt();
        System.out.println("Add : "+(x+y));
        System.out.println("Substract : "+(x-y));
        System.out.println("Multiplication : "+(x*y));
        System.out.println("Division : "+(x/y));
        System.out.println("Modulo : "+(x%y));
        }
        catch(ArithmeticException k)
        {
            System.out.println("Denominator cannot be zero during division..");
        }
        catch(InputMismatchException u)
        {
            System.out.println("Wrong Input");
        }
        finally
        {
            System.out.println("Code after exception handling");
        }
    }
}
