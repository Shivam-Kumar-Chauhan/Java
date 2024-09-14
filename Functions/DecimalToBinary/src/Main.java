import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decTObin(n) ;

    }

    public static void decTObin(int n) {
        int pow = 0;
        int binNum =0;
         while (n>0) {
             int rem = n%2;
             binNum = binNum + (rem * (int)Math.pow(10,pow));

             pow++;
             n = n/2;
         }
        System.out.println("Binary Number is " + binNum );
    }
}