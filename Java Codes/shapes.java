public abstract class shapes {
    public abstract double perimeter();
    public abstract double area();
    
}
    class circle extends shapes{
    double radius=5;
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Shapes1{
    public static void main(String args[])
    {
        circle s1=new circle();
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}    