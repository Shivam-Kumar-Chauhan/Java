import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum =0;

        for (int i = 1; i <=N ; i++) {
            sum += i;
        }
        System.out.println("Sum of " + N + " Numbers are " + sum);
    }
}
