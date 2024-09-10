import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int f = 0;

        if (a == 1|| a==2) {
            f=0;
        }
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    f++;
                    break;
                }
            }
        }
        if (f == 0)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    }
}