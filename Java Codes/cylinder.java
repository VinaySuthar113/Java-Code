public class cylinder {
    private double radius;
    private double height ;
    public double getradus()
    {
        return radius;
    }
    public double getheight()
    {
        return height;
    }
    public void setdimenssion(double r,double h)
    {
        if(r<0 )
        {
            radius=1;
        }
        else{
             radius =r;
        }
                if(h<0 )
        {
            height=1;
        }
        else{
             height =h;
        }
    }
    public double area()
    {
        return 2*((Math.PI*height*radius)+(Math.PI*radius*radius));
    }
}
 class cylinder1{
    public static void main(String args[])
    {
        cylinder c=new cylinder();
        c.setdimenssion(4, 7);
        System.out.println("the area of the cylinder is  " + c.area());
    }
 }
