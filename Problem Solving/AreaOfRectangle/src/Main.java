import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        double AreaOfRectangle = length * width;

        System.out.println("Area of Rectangle is: " + AreaOfRectangle);
    }
}