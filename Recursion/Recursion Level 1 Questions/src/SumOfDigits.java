// Q. Sum of Digits...

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter any number to calculate sum of its digits: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=digitSum(n);
        System.out.println(ans);
    }
    static int digitSum(int n) {
        if (n==0)
            return 0;
        return (n%10) + digitSum(n/10);
    }
}