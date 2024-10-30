import java.util.Scanner;
public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int low = sc.nextInt();
        System.out.print("Enter second Number: ");
        int high = sc.nextInt();
        System.out.println("Prime number between "+low+" and "+high+" are:");
        for (int n = low; n <= high ; n++) {
            int count = 0;
            for (int i = 2; i*i<= n ; i++) {
                if(n%i==0){
                    count ++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n+ " is Prime number");
            } else {
                System.out.println(n+ " is not Prime number");
            }
        }
    }
}