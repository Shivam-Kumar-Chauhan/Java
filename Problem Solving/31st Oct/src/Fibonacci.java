// Q. Print Fibonacci Series

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibbo(n);
    }
    static void fibbo(int n) {
        int a=0;
        int b=1;
        int c=0;
        int count=0;
        while(count<n) {
            System.out.println(a+ " ");
            c=b+a;
            a=b;
            b=c;
            count=count+1;
        }
    }
}
