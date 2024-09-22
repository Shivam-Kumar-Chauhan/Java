import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int Radius = sc.nextInt();

        double AreaOfCircle = 3.14 * Radius * Radius;

        System.out.println("Area of Circle is: " + AreaOfCircle);
    }
}