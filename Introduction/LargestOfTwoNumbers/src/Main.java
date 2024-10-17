import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Enter the first Number: ");
        a=sc.nextInt();
        System.out.print("Enter the second Number: ");
        b=sc.nextInt();

        if(a>b){
            System.out.println("The Largest Number is: " + a);
        }
        if(a<b){
            System.out.println("The Largest Number is: " + b);
        }
    }
}