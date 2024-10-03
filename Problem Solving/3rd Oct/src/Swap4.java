// Swapping with bitwise XOR(^)

// XOR means if same then 1 otherwise 0.

import java.util.Scanner;

public class Swap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before: " + a + " " + b);

        a = a^b;
        b= a^b;
        a = a^b;

        System.out.println("After: " + a + " "+b);
    }
}