// Q. Count number of 0 in a number...

import java.util.Scanner;
public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    static int count(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem==0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
    }
}
