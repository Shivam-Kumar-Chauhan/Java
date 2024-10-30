import java.util.Scanner;

public class Setbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));

        System.out.print(setBits(n));
    }
    static int setBits(int n) {
        int count =0;
        while(n>0) {
            count ++;
            n= n & (n-1);
        }
        return count;
    }
}
