// Q. String is palindrome or not

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0){
            return false;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}