// largest of three number

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max = a;
//
//        if(b>max){
//            max = b;
//        }
//        if(c>max) {
//            max = c;
//        }

        // another method

        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);
    }
}