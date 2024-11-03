// Q. Product of digits...

import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter any number to calculate product of its digits: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=digitProduct(n);
        System.out.println(ans);
    }
    static int digitProduct(int n) {
        if (n%10 == n)
            return n;
        return (n%10) * digitProduct(n/10);
    }
}