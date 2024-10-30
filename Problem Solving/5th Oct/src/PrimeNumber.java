import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            // for (int i = 2; i * i <= n ; i++) {
            if(n%i==0){
                count ++;
                //break;
            }
        }
        if(count == 2){
            // if(count == 0){
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n+ " is not prime number");
        }
    }
}
