// Q. Print prime that comes under Number n...

import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    static void sieve(int n , boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
}