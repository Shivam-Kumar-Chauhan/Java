import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Side: ");
        double side = sc.nextDouble();

        double Perimeter = 4 * side;

        System.out.println("Perimeter is " + Perimeter);
    }
}
