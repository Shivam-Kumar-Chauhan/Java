import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = sum(a,b);
        System.out.println(answer);
    }

    static int sum (int a, int b) {
        int sum = a + b;
        return sum;
    }
}