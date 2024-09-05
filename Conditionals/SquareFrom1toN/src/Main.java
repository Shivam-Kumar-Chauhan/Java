import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i;
        for (i = 1; i<=n; i++) {
            System.out.println(i * i);
        }
    }
}