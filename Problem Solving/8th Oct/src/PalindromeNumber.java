// Check if given Number is Palindrome or Not

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int ori_n = n;
        int rev = 0;

        while(n!=0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        if(ori_n == rev){
            System.out.println(rev+ " is palindrome number");
        } else {
            System.out.println(rev+ " is not palindrome number");
        }
    }
}
