import java.util.Scanner;
class Thread1 extends Thread{
    int i;
    public void run(){
        for(i=1;i<11;i++)
            System.out.println(i);
    }
}
class Thread2 extends Thread{
    int i;
    public void run(){
        for(i=11;i<21;i++)
            System.out.println(i);
    }
}
class Thread3 extends Thread{
    int i;
    public void run(){
        for(i=21;i<31;i++)
            System.out.println(i);
    }
}
public class prac1f {


    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        System.out.println("Name of first thread is: "+t1.getName());
        System.out.println("Name of second thread is: "+t2.getName());
        System.out.println("Name of third thread is: "+t3.getName());
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        try{
            t2.join();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        t3.start();

    }
}