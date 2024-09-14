import java.util.Scanner;
class CIRCLE {
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumfrence()
    {
        return perimeter();
    }

    
}
 class CIRCLE1{
        public static void main (String args[])
        {

            Scanner S = new Scanner(System.in);
            CIRCLE c1 = new CIRCLE();
            c1.radius= S.nextInt();
            System.gc();
    }
}