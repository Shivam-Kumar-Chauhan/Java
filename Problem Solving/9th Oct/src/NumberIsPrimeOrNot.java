// Check number is prime or not

import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int count = 0;

        if (n>1){
            for (int i = 1; i <= n; i++) {
                if (n%i==0)
                    count++;
            }
            if(count == 2){
                System.out.println(n+ " is Prime number");
            } else {
                System.out.println(n+ " is not Prime number");
            }
        } else {
            System.out.println(n+ " is not Prime Number");
        }
    }
}
