class Mythread extends Thread
{
    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i + "Hello");
            i++;
        }
    }
}
class threading {
    public static void main(String args[])
    {
        Mythread m= new Mythread();
        m.start();
        int i =1;
        while(true)
        {
            System.out.println(i + "World");
            i++;
        }
    }
    
}