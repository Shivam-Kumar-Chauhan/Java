// Q. Check for prime...

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i+" "+ isPrime(i));
        }

    }

    static boolean isPrime(int n) {
        if(n<=1)
            return false;

        int c =2;
        while(c*c <= n) {
            if (n % c ==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}