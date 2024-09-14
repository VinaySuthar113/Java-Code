class Interprocess
{
    boolean flag=true;
    int value;
    synchronized public void set(int v)
    {
        while(flag!=true)
        try{wait();}catch(Exception e){}
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get()
    {
        int x = 0;
        while(flag!=false)
        try{wait();}catch(Exception e){}
        x=value;
        flag=true;
        notify();
        return x;
    }

}
class producer extends Thread
{
    Interprocess data;
    public producer(Interprocess d)
    {
        data = d;
    }
    public void run()
    {
        int count = 1;
        while(true)
        {
            data.set(count);
            System.out.println("producer" + count);
        }
    }
}
class consumer extends Thread
{
    Interprocess data;
    public consumer(Interprocess d)
    {
        data = d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("consumer" + value);
        }
    }
}
public class Interthread
{
    public static void main(String args[])
    {
        Interprocess it = new Interprocess();
        producer p = new producer(it);
        consumer c = new consumer(it);
        p.start();
        c.start();
    }
}