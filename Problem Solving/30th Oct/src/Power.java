// Q. find the power of n (Power 5 of Base 2)

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base: ");
        int base = sc.nextInt();
        System.out.print("Enter the Power: ");
        int power = sc.nextInt();

        int ans = 1;

        while (power>0) {
            if ((power & 1) == 1) {
                ans = ans*base;
            }
            base = base * base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
