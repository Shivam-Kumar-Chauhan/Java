// String builder method...

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        StringBuilder sbl = new StringBuilder();
        sbl.append(n);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reversed Number is: " + rev);
    }
}
