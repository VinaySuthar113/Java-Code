    public class rectangle {
        private double lenght;
        private double breadth;
        public double getlength()
        {
            return lenght;
        }
            public double getbreadth()
        {
            return breadth;
        }
            public void setlength(double l)
        {
            lenght = l;
        }
            public void setbreadth(double b)
        {
            breadth = b;
        }
        public double area()
        {
            return lenght*breadth;
        }
        public double perimeter()
        {
            return 2*(breadth + lenght);
        }
        public boolean issquare()
        {
            return lenght==breadth;
        }
    }
    class rectangle1{
        public static void main ( String args[])
        {
            rectangle r1 = new rectangle();
            System.out.println("enter length and breadth");
            r1.setlength(5.5);
            r1.setbreadth(5.5);
            System.out.println("area of the rectangle is  " + r1.area());
            System.out.println("perimeter of the rectangle is  " + r1.perimeter());
            System.out.println(r1.issquare());
            System.gc();
        }
    }

