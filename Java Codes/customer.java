public class customer {
    private String customerid;
    private String customername;
    private String customeraddres;
    private Long customerphonenumber;
    public void setcustomerid(String i)
    {
       customerid=i;
    }   
     public void setcustomername(String n)
    {
       customername=n;
    }   
     public void setcustomeraddress(String a)
    {
       customeraddres=a;
    }   
     public void setcustomerphonenumber(Long p)
    {
      customerphonenumber=p;
    }   
     public String id()
    {
      return customerid;
    }   
     public String name()
    {
      return customername;
    }   
     public String addres()
    {
      return customeraddres;
    }   
     public Long phonenumber()
    {
      return customerphonenumber;
    }   

}
class customer1{
    public static void main(String[] args)
    {
        customer c1= new customer();
        c1.setcustomerid("uh8ndhhf838d");
        c1.setcustomername("mohan lal");
        c1.setcustomeraddress("ndeowoheifhceheuindw");
        c1.setcustomerphonenumber(Long.parseLong("25262861286"));
        System.out.println("customer id :- " + c1.id());
        System.out.println("customer name  :- " + c1.name());
        System.out.println("customer addres:- " + c1.addres());
        System.out.println("customer phone number:- " + c1.phonenumber());
    }
}