import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        System.out.println(stringReverse3(s));
    }

    // using concatenation method

    static String stringReverse(String s){
        String reverse = "";
        int len = s.length();
        for (int i = len-1 ; i >=0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    // using character array

    static String stringReverse2(String s){
        String reverse = "";
        char a[] = s.toCharArray();
        int len = a.length;
        for (int i = len -1; i>=0 ; i--) {
            reverse = reverse + a[i];
        }
        return reverse;
    }

    // using StringBuffer class

    static String stringReverse3(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
