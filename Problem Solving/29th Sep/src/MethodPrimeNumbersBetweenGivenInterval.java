import java.util.Scanner;
public class MethodPrimeNumbersBetweenGivenInterval {

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound of the interval: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound of the interval: ");
        int upper = sc.nextInt();
        System.out.printf("Prime numbers between %d and %d are: ", lower, upper);
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}