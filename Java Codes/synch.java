class MyData
{
    public void display(String str)
    {
        synchronized(this)
        {
            for(int i=0;i<=str.length();i++)
            {
                System.out.println(str.charAt(i));
            }
        }
    }
}
class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }    
    public void run()
    {
        System.out.println("Hello World");
    }
}
class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }    
    public void run()
    {
        System.out.println("Welcome");
    }
}
public class synch {
    public static void main(String args[])
    {
        MyData M=new MyData();
        MyThread1 T1 = new MyThread1(M);
        MyThread2 T2 = new MyThread2(M);
        T1.start();
        T2.start();
    }
}
