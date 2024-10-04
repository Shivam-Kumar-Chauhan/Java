import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String ori_str = str;

        String rev = "";
        int len = str.length();

        for (int i = len -1 ; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
        if (ori_str.equals(rev)){
            System.out.println(ori_str+ " is palindrome string");
        } else {
            System.out.println(ori_str+ " is not palindrome string");
        }
    }
}
