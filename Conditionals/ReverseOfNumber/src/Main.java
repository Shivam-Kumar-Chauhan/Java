import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int re = 0;
        while(n>0) {
            int rem = n % 10;
            n = n/10;
            re = re * 10 + rem;
        }
        System.out.println(re);
    }
}