import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is " + GCD(a,b));
    }

    static int GCD (int a, int b) {
        if(a == 0)
            return a;
        if(b == 0)
            return b;
        if(a == b)
            return a;
        if( a>b)
            return GCD(a - b, b);
        return GCD(a,b - a);
    }
}
