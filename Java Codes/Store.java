interface member
{
   public void callback();
}
class Store{
    member members[]= new member[10];
    int count=0;
    void register(member m)
    {
       members[count++]=m;
    }
    void InviteSale()
    {
        for (int i=0;i<=count;i++)
        {
            members[i].callback();
        }
    }
}
class Customer implements member
{
    String name;
    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("OK,I will visit" + ""+ name);
    }
}
class Application
{
    public static void main(String args[])
    {
        Store s=new Store();
        Customer c1=new Customer("Vinay");
        Customer c2=new Customer("Kunal");
        s.register(c1);
        s.register(c2);
        s.InviteSale();
    }
}