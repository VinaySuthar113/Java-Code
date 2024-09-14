public class product {
    private int itemnumber;
    private String itemname;
    private double itemprice;
    private int itemquantity;
    public product(int nu, String n,double p,int q)
    {
        itemnumber=nu;
        itemname=n;
        itemprice=p;
        itemquantity=q;
    }
    public int getitemnumber()
    {   
        
       return itemnumber;
    }
    public String getitemname()
    {   
       return itemname;
    }
    public double getitemprice()
    {   
        return itemprice;
    }
        public int getitemquantiy()
    {   
        return itemquantity;
    }
    public int itemno()
    {
       return itemnumber;
    }
    public String name()
    {
        return itemname;
    }
    public double price()
    {
        return itemprice;
    }
    public int quantity()
    {
        return itemquantity;
    }
}
class product1{
    public static void main(String args[])
    {
        product p1= new product(151,"TSHIRTS",300,21);
        System.out.println("your selected item is :- "+ p1.name());
        System.out.println("itemcode of your item :- "+ p1.itemno());
        System.out.println("price of the item:- "+ p1.price());
        System.out.println("quantity available ofthe item:- "+ p1.quantity());                        
    }
}