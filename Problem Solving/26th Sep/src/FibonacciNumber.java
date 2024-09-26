import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(a + " " + b);

        for (int i = 2; i <n ; i++) {
            c= a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}
