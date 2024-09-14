import java.lang.String;
class WhiteBoard{
    String message;
    int NoOfStudent=0;
    int count=0;
    public void Attendence()
    {
        NoOfStudent++;
    }
    synchronized public void Write(String msg)
    {
        System.out.println("teacher is writinng" + msg);
        while(count!=0)
        try {
            wait();
        } catch (Exception e) {}
        message=msg;
        count=NoOfStudent;
        notifyAll();
    }
    synchronized public String Read()
    {
        while(count==0)
            try {
                wait();
            } catch (Exception e) {}
            String msg= message;
            if(count==0)
                notify();
            return msg;
    }
}
class Teacher extends Thread
{
    WhiteBoard wb;
    String notes[]={"java is a very tough language","java suck","end"};
    public Teacher(WhiteBoard w)
    {
        wb=w;
    }
    public void run()
    {
        for(int i=0;i<=notes.length;i++)
        {
            wb.Write(notes[i]);
        }
    }
}
class Student extends Thread
{
    String Name;
    WhiteBoard wb;
    public Student(String n ,WhiteBoard w)
    {
        Name = n;
        wb = w;
    }
    public void run()
    {
        String message;
        wb.Attendence();
        do
        {
            message=wb.Read();
            System.out.println(Name + "Reading" + message);
            System.out.flush();
        }while(!message.equals("end"));
    }
}
public class ClassRoom {
    public static void main(String args[])
    {
        WhiteBoard W = new WhiteBoard();
        Teacher t = new Teacher(W);
        Student s1 =new Student("1. vinay",W);
        Student s2 =new Student("2. dinay",W);
        Student s3 =new Student("3. finay",W);
        Student s4 =new Student("4. rinay",W);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
    
}
