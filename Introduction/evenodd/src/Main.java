import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}