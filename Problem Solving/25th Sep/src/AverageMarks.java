import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input First Subject Marks: ");
        int num1 = in.nextInt();
        System.out.print("Input Second Subject Marks: ");
        int num2 = in.nextInt();
        System.out.print("Input Third Subject Marks: ");
        int num3 = in.nextInt();
        System.out.print("Input Fourth Subject Marks: ");
        int num4 = in.nextInt();
        System.out.print("Enter Fifth Subject Marks: ");
        int num5 = in.nextInt();
        System.out.println("Average of Marks is: " + (num1 + num2 + num3 + num4 + num5) / 5);
    }
}