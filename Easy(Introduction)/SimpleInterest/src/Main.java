//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int p,r,t;
        float SI;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle: ");
        p = sc.nextInt();

        System.out.print("Enter the Rate: ");
        r = sc.nextInt();

        System.out.print("Enter the Time: ");
        t = sc.nextInt();

        SI = (float) (p * r * t)/100;

        System.out.print("Simple Interest is " + SI);
    }
}