import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        int n = 422441223;
        int count = 0;

        while(n>0) {
            int rem = n%10;
            if(rem==2) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}