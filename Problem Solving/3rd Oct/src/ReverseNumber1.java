// Using Algorithm

import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int reverse = 0;
        while (n!=0)
        {
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        System.out.println("Reversed Number is: " + reverse);
    }
}