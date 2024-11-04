// Q. Count steps to Reduce a number to 0...

import java.util.Scanner;
public class CountSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(steps(n));
    }
    static int steps(int n) {
        return helper(n, 0);
    }
    private static int helper(int n, int steps) {
        if(n==0)
            return steps;

        if (n%2==0)
            return helper(n/2,steps+1);
        return helper(n-1, steps+1);
    }
}