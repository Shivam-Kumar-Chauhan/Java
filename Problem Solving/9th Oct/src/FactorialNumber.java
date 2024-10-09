// Find Factorial of a number
// Ex-
// 5!= 5*4*3*2*1=120.
//OR
//5!= 1*2*3*4*5=120

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int factorial = 1;

//        for logic = 5!= 5*4*3*2*1=120.
//        for (int i = n; i >=1 ; i--)

        // 5!= 1*2*3*4*5=120
        for (int i = 1; i <=n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+n+ " is "+factorial);
    }
}
