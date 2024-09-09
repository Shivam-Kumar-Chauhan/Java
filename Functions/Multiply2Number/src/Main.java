import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res =  Multiply(a,b);
        System.out.println(res);
    }

    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;
    }
}