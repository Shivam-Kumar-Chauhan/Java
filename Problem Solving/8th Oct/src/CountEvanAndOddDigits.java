// Count Even & Odd Digits in Given Number

import java.util.Scanner;

public class CountEvanAndOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int even_count = 0;
        int odd_count = 0;

        while(num>0) {
            int rem = num%10;

            if(rem%2==0){
                even_count++;
            } else {
                odd_count++;
            }
            num = num/10;
        }
        System.out.println("Number of even digits "+even_count);
        System.out.println("Number of odd digits "+odd_count);
    }
}
