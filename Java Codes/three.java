import java.util.Scanner;

public class three {
    public void Sum() {
        System.out.println("Enter three Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();

        int d = a + b + c;

        System.out.println("Sum is : " + d);
    }

    
    public static void main(String[] args) {
        three s1 = new three();
        s1.Sum();
    }
}
