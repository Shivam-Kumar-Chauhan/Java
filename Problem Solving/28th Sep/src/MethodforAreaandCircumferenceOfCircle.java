import java.util.Scanner;

public class MethodforAreaandCircumferenceOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextDouble();
        System.out.println("Area = "+  Area(r));
        System.out.println("Circumference = " + Cir(r));
    }

    public static double Area(double r) {
        double ar = Math.PI * (r * r);
        return ar;
    }

    public static double Cir(double r) {
        double circum = Math.PI * 2 * r;
        return circum;
    }
}
