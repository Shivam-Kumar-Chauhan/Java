
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Side: ");
        int side = sc.nextInt();

        int Perimeter = 3 * side;

        System.out.println("Perimeter is " + Perimeter);
    }
}