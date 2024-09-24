import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Natural Number: ");
        int n = sc.nextInt();

        System.out.println("Average is " + avgOfN(n) );
    }

    public static float avgOfN(int n) {
        return (float)(1 + n)/2;
    }
}
