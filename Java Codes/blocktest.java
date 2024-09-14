public class blocktest {
    static{
        System.out.println("block 1");
    }
    static{
        System.out.println("block 2");
    }
    
}
class practice{
    public static void main(String args[])
    {
        blocktest bt=new blocktest();
        System.out.println("main");
    }
}