import java.util.*;

public class prac1d extends Thread
{
    public void run()
    {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("Thread-0"))
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Within Thread : "+Thread.currentThread().getName()+" "+i);
            }
        }
        else if(threadName.equals("Thread-1"))
        {
            for(int i=11;i<=20;i++)
            {
                System.out.println("Within Thread : "+Thread.currentThread().getName()+" "+i);
            }
        }
        else if(threadName.equals("Thread-2"))
        {
            for(int i=21;i<=30;i++)
            {
                System.out.println("Within Thread : "+Thread.currentThread().getName()+" "+i);
            }
        }
    }
    public static void main(String args[])
    {
        prac1d dt1=new prac1d();
        prac1d dt2=new prac1d();
        prac1d dt3=new prac1d();
        dt1.start();//1-10
        dt2.start();//11-20
        dt3.start();//21-30
        System.out.println("Thread 1 name : "+dt1.getName());
        System.out.println("Thread 2 name : "+dt2.getName());
        System.out.println("Thread 3 name : "+dt3.getName());
        System.out.println("Main Block");
    }
}
