// Swapping in single statement...

import java.util.Scanner;

public class Swap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before: " + a + " " + b);

        b = a + b - (a=b);

        System.out.println("After: " + a + " "+b);
    }
}