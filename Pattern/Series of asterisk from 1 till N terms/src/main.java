import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}