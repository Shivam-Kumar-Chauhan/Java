import java.util.Scanner;

public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " are " + digitSum(n));
    }
    static int digitSum(int n) {
        int sum = 0;

        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}