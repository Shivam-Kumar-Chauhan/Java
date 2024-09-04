import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Re = 0;
        while(true) {
            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter 1st Number: ");
                int num1 = in.nextInt();
                System.out.print("Enter 2nd Number: ");
                int num2 = in.nextInt();
                if(op=='+'){
                    Re = num1 + num2;
                }
                if(op=='-'){
                    Re = num1 - num2;
                }
                if(op=='*'){
                    Re = num1 * num2;
                }
                if(op=='/'){
                    if(num2 !=0) {
                        Re = num1 / num2;
                    }
                }
                if(op=='%'){
                    Re = num1 % num2;
                }
            } else if (op=='x'||op=='X'){
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(Re);
        }
    }
}