public class Coffeemachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    private static Coffeemachine myInstance = null;

    private Coffeemachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty) {
        waterQty = qty;
    }

    public void fillSugar(float qty) {
        sugarQty = qty;
    }

    public float getCoffee() {
        return 0.15f;
    }

    public static Coffeemachine getInstance() {
        if (myInstance == null) {
            myInstance = new Coffeemachine();
        }
        return myInstance;
    }
}

class Singleton {
    public static void main(String[] args) {
        Coffeemachine m1 = Coffeemachine.getInstance();
        Coffeemachine m2 = Coffeemachine.getInstance();
        Coffeemachine m3 = Coffeemachine.getInstance();
        System.out.println(m1 + " " + m2 + " " + m3);
        if (m1 == m2 && m2 == m3) {
            System.out.println("same");
        }
    }
}
