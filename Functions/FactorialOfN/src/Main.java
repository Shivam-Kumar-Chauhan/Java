import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is "  + fact(n));

    }
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans = ans *i;
        }
        return ans;
    }
}