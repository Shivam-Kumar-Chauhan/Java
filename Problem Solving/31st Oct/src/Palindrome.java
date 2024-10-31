// Q. Check Palindrome Number...

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int remainder =0;
        int reverseNum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while(n>0) {
            remainder = n%10;
            reverseNum = (reverseNum*10)+remainder;
            n=n/10;
        }
        if (temp == reverseNum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not");
        }
    }
}
