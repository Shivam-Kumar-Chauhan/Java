// Q. Reverse a number...

import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseN(n));
    }
    static int reverseN(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) * (int) Math.pow(10, Integer.toString(n).length() - 1) + reverseN(n / 10);
    }
}