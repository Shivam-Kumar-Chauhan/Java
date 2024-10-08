// Largest of 3 number using <Ternary Operator>

import java.util.Scanner;

public class LargestOf3NumberTernaryOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        int largest= num1>num2?num1:num2;
        largest = num3>largest?num3:largest;

        System.out.println(largest);
    }
}
