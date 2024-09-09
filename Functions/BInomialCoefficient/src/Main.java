import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       // int res = factorial(n);
       // System.out.println(res);

        int re = binCoff(n,r);
        System.out.println(re);
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i<=n; i++) {
            f = f *i;
        }
        return f;
    }

    public static int binCoff(int n, int r) {
        int fn= factorial(n);
        int fr = factorial(r);
        int fnr = factorial(n-r);

        int bC = fn/(fr*fnr);

        return bC;
    }
}