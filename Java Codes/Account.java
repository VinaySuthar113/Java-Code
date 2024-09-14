class Account1
{
    public static void main(String args[])
    {
    account a1= new account("vinay suthar",Long.parseLong("9948329"),"ffufiferfhefiw",Long.parseLong("28782002"),"27/05/2006",5000.00);
System.out.println(a1.getname());
System.out.println(a1.getaccountNo());
System.out.println(a1.getAddres());
System.out.println(a1.getphoneNo());
System.out.println(a1.getDateOfBirth());
System.out.println(a1.getbalance());

}

}


 class account {
    private String name;
    private Long accountNo;
    private String Addres;
    private Long phoneNo;
    private String DateOfBirth;
    private double balance;
    
    public account1(){}

    public account1(String n,Long ac,String Ad,Long p,String dob,double b)
    {
        name=n;
        accountNo=ac;
        Addres=Ad;
        phoneNo=p;
        DateOfBirth=dob;
        balance=b;
    }
    public String getname()
    {
        return name;
    }
     public Long getaccountNo()
    {
        return accountNo;
    }
    public String getAddres()
    {
        return  Addres;
    }
    public Long getphoneNo()
    {
        return phoneNo;
    }
    public String getDateOfBirth()
    {
        return DateOfBirth;
    }               
    public double getbalance()
    {
        return balance;
    }

    
}
    class savingAccount extends account{

        public void deposite()
        {

        }
        public void withdraw()
        {

        }
        public void fixedDeposite()
        {

        }
        public void liquidate()
        {

        }
        public void CloseAccount()
        {

        }
    }
    class loanAccount extends account
    {
        public void PayEMI()
        {

        }
        public void TopUpLoan()
        {

        }
        public void RepayMent()
        {

        }
        public void CloseAccount()
        {

        }
    }
