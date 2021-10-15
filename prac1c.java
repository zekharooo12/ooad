import java.util.*;
//factors of a number.
class NegativeNumberException extends Exception
{
}
public class prac1c 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter  non negative integer : ");
        x=sc.nextInt();
        try
        {
            if(x<0)
                throw new NegativeNumberException();
            for(int i=1;i<=x;i++)
            {
                if(x%i ==0)
                {
                    System.out.println(i);
                }
            }
        }
        catch(NegativeNumberException k)
        {
            System.out.println("!!Negative number Entered!!");
        }
    }
}
