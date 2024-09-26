import java.util.Scanner;
public class nCrANDnPr {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter Value of r: ");
        int r = sc.nextInt();
        System.out.println("nCr of " + n + "C" + r + " = " + nCr(n, r));
        System.out.println("nPr of " + n + "P" + r + " = " + nPr(n, r));
    }
}