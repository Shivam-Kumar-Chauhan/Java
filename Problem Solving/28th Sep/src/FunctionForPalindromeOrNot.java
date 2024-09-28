import java.util.Scanner;

public class FunctionForPalindromeOrNot {

    public static boolean checkPalind (int n) {
        int reverse = 0;
        int temp =n;
        while(temp!=0){
            reverse = (reverse *10) + (temp % 10);
            temp = temp/10;
        }
        return (reverse == n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        System.out.println(checkPalind(n));
    }
}
