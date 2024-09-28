import java.util.Scanner;
public class MethodForLargestSmallestOf3Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        System.out.println(largest(a,b,c) + " is largest");
        System.out.println(smallest(a,b,c) + " is smallest");
    }

    public static int largest(int a, int b, int c) {
        int max = a;
        if(b>max){
            max = c;
        }
        if(c>max){
            max =c;
        }
        return max ;
    }

    public static int smallest (int a, int b, int c) {
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c ;
        }
        return min ;
    }
}
