// Function with Parameters

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sum(a,b); // a,b is arguments or actual parameters
        System.out.println(sum);
    }

    public static int Sum(int a, int b) { // a & b is parameters or formal parameter
        int Sum = a+b;
        return Sum;
    }
}