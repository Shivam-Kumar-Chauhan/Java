// Q. Print Number from N to 1...

import java.util.Scanner;
public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fun(N);
    }
    static void fun(int N) {
        if(N==0)
            return;
        System.out.println(N);
        fun(N-1);
    }
}