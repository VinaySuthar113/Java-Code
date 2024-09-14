interface test
{
    void meth1();
    void meth2();
}
class my implements test{
    public void meth1()
    {
        System.out.println("meth 1 of my ");
    }
    public void meth2()
    {
        System.out.println("meth 2 of my");
    }
        public void meth3()
    {
        System.out.println("meth 3 of my");
    }
}

class interfacepractice{
    public static void main(String args[])
    {
        test t = new my();
        t.meth1();
        t.meth2();
    }
}