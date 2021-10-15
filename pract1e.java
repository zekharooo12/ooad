
    class MyThread1 implements Runnable{
    int i;
    public void run(){
        for(i=1;i<11;i++)
            System.out.println(i);
    }
}
    class MyThread2 implements Runnable{
        int i;
        public void run(){
            for(i=11;i<21;i++)
                System.out.println(i);
        }
    }
    class MyThread3 implements Runnable{
        int i;
        public void run(){
            for(i=21;i<31;i++)
                System.out.println(i);
        }
    }
    public class pract1e {
        public static void main(String[] args) {
            MyThread1 Tr1=new MyThread1();
            Thread T1=new Thread(Tr1);
            T1.start();
            MyThread2 Tr2=new MyThread2();
            Thread T2=new Thread(Tr2);
            T2.start();
            MyThread3 Tr3=new MyThread3();
            Thread T3=new Thread(Tr3);
            T3.start();
        }
    }

