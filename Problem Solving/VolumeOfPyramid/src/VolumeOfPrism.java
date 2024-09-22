import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double l = sc.nextDouble();
        System.out.println("Enter the width: ");
        double w = sc.nextDouble();
        System.out.println("Enter the height: ");
        double h = sc.nextDouble();

        double VolumeOfTriangularPrism = (l * w * h)/2;
        double VolumeOfRectangularPrism = l * w * h;

        System.out.println("Volume Of Triangular Prism " + VolumeOfTriangularPrism);
        System.out.println("Volume Of Rectangular Prism " + VolumeOfRectangularPrism);
    }
}
