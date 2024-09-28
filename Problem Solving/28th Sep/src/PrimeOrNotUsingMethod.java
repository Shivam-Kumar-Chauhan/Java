import java.util.Scanner;

public class PrimeOrNotUsingMethod {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int x = sc.nextInt();
        if(isPrime(x))
            System.out.println("True");
        else
            System.out.println("False");
    }
}