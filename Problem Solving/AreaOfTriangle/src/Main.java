import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        float Base= sc.nextFloat();
        System.out.print("Enter the Height: ");
        float Height= sc.nextFloat();

        float AreaOfTriangle = (Base * Height)/2;

        System.out.println("The Area of Triangle is: " + AreaOfTriangle);

    }
}