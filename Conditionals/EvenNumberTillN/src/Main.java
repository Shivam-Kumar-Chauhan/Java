// Even number till n...

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = in.nextInt();

        for(int i = 2; i<=n; i=i+2) {
            System.out.println(i);
        }
    }
}