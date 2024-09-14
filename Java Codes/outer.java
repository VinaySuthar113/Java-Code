class Outer {
    int x = 10;

    public class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println("Value of x is " + x);
            System.out.println("Value of y is " + y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("Value of y is " + i.y);
    }
}

class OuterMain {
    public static void main(String args[]) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner i = o.new Inner();
        i.innerDisplay();
    }
}
