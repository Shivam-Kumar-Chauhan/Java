import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rs;
        double usd;

        System.out.print("Enter the amount in Rupees: ");
        rs = (int) sc.nextDouble();

        usd = rs * 0.012;
        System.out.println(rs + " Rupees = " + usd + " Dollar");
    }
}