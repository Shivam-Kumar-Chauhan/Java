import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibona(n));
    }

    static int fibona(int n) {
        if (n<2){
            return n;
        }
        return fibona(n-1) +fibona(n-2);
    }
}
