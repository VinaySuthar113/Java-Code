class ATM
{
    synchronized public void CheckBalance(String name)
    {
        System.out.print(name + " " + "Checking" + " ");
        try{            
            Thread.sleep(1000);
        }
        catch(Exception s){}
        System.out.println("Balance");
    }
    synchronized public void Withdraw(String name , int amount)
    {
        System.out.print(name +" " + "Withdrawing" + " ");
        try{
            Thread.sleep(1000);
        }
        catch(Exception s){}
        System.out.println(amount);
    }
}
class Customer extends Thread
{
    ATM atm;
    String name;
    int amount;
    Customer(String n , ATM atm, int amt)
    {
        name =n;
        this.atm=atm;
        amount=amt;
    }
    public void UseATM()
    {
        atm.CheckBalance(name);
        atm.Withdraw(name,amount);
    }
    public void run()
    {
        UseATM();
    }

}
class ATMpractice
{
    public static void main(String args[])
    {
        ATM atm = new ATM();
        Customer c1 = new Customer("Vinay",atm, 15000);
        Customer c2 = new Customer("kiran",atm, 39000);
        c1.start();
        c2.start();
    }
}
