import java.util.Scanner;

// prime number is a number that is divisible only by 1 and itself
// ex: 2,3,5,7,11,13,17

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter any Number: ");
        n = sc.nextInt();
        int count = 0;

        for(int i =1; i<=n; i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println(n + " is a Prime Number");
        }
        else {
            System.out.println(n + " is Not a Prime Number");
        }
    }
}
