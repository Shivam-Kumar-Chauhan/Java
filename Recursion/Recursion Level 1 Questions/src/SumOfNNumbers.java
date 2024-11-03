// Q. Sum of n Numbers...

import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
    }
    static int sum(int n) {
        if (n==1)
            return 1;
        return n + sum(n-1);
    }
}
