// palindrome number-->
// A given number can be said palindromic in nature
// if the reverse of the given number is the same as that of a given number.

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        int original_number = number;

        int reverse = 0;

        while(number!=0){
            reverse = reverse * 10 + number % 10;
            number = number/10;
        }
        if(original_number == reverse){
            System.out.println(original_number+ " is Palindrome number");
        }
        else{
            System.out.println(original_number+ " is not Palindrome number");
        }
    }
}
