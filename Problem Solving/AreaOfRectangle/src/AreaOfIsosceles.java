// The math formula for Isosceles triangle area is b * √(4a2 – b2)/4.

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the Height: ");
        double height = sc.nextDouble();

        double Area = (1 * base * height)/2;

        System.out.println("The Area of Isosceles is: " + Area);
    }
}
