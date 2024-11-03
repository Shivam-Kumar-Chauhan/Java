// Q. Print Number from 1 to n...

import java.util.Scanner;
public class _1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        funRev(n);
    }
    static void funRev(int n) {
        if (n==0)
            return;
        funRev(n-1);
        System.out.println(n);
    }
}