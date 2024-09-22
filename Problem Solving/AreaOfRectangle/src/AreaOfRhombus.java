//A rhombus is a polygon, whose all four sides is equal in length and opposite side is parallel.
//Area of Rhombus = ( d1 * d2 ) / 2
//Where, d1 and d2 are the two diagonals of rhombus.

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Diagonal: ");
        double  d1 = sc.nextDouble();

        System.out.print("Enter the 2nd Diagonal: ");
        double d2 = sc.nextDouble();

        double area = (d1 * d2)/2;

        System.out.println("Area is " + area);
    }
}
