// Q. check if a number is power of 2 or not...

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("False");
        } else {
                boolean ans = (n & (n - 1)) == 0;
                System.out.println(ans);
        }
    }
}