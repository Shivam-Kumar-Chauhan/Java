import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,Re =0;
        char Opt;

        System.out.print("Enter the First Number: ");
        a=sc.nextInt();
        System.out.print("Enter the Second Number: ");
        b=sc.nextInt();
        System.out.println("Enter the Operator(+, -, *, /): ");
        Opt=sc.next().charAt(0);

        if (Opt == '+'){
            Re = a+b;
        }
        if (Opt == '-'){
            Re = a-b;
        }
        if (Opt == '*'){
            Re = a * b;
        }
        if (Opt == '/'){
            Re = a / b;
        }
        System.out.println("The Result is " + Re);
    }
}