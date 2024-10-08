// Check if given String is Palindrome or Not

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String ori_str = str;
        String rev = "";

        int len = str.length();
        for (int i = len - 1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
//        System.out.println(rev);
        if(ori_str.equals(rev)){
            System.out.println(rev+ " is palindrome string");
        } else {
            System.out.println("Given String is not palindrome string");
        }
    }
}
