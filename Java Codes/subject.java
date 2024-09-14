public class subject {
    private String subid;
    private String name;
    private int maxmark;
    private int minmark;
    public subject(String s,String n, int mx,int mn)
    {
        subid=s;
        name=n;
        maxmark=mx;
        minmark=mn;
    }
    public String getsubid()
    {
        return subid;
    }
    public String getname()
    {
        return name;
    }
    public int getmaxmark()
    {
        return maxmark;
    }
    public int getminmark()
    {
        return minmark;
    }
        

}
class subject1
{
    public static void main(String args[])

    {
        
        subject sj=new subject("MATHAMATICS","VINAY SUTHAR",100,93);
        System.out.println(" SUBJECT CODE :-" + sj.getsubid()  );
        System.out.println(" NAME OF THE SUBJET :-" + sj.getname());
        System.out.println(" NAME OF THE SUBJET :-" + sj.getmaxmark());
        System.out.println(" NAME OF THE SUBJET :-" + sj.getminmark());

        
    }
}
