public class Overriding {
    public static void main(String args[])
    {
       TV s = new TV();
       SmartTV sm=new SmartTV();
       s.SwitchOff();
       s.SwitchOn();
       sm.Browse();
       sm.SwitchOff();
       sm.SwitchOn();
    }
    
}
class TV{
    public void SwitchOn()
    {
        System.out.println("SwitchOn the Tv");
    }
    public void SwitchOff()
    {
        System.out.println("SwitchOff the Tv");        
    }
}
class SmartTV{

    public void SwitchOn()
    {
        System.out.println("lkhkhSwitchOn the Tv");
    }
    public void SwitchOff()
    {
        System.out.println("hjjgSwitchOff the Tv");        
    }
    public void Browse()
    {
        System.out.println("Browse the Tv");        
    }    
    
}