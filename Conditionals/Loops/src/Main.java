import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // print numbers from 1 to n;

        // for loop

//        for (int i = 1; i <= n ; i++) {
//            System.out.print(i + " ");
//        }
//
//        // while loop
//
        int num = 1;
        while (num<=n){
            System.out.println(num);
            num +=1;
        }

        // do while loop

//        do{
//            System.out.println(n);
//            n++;
//        } while(n <=5);

    }
}