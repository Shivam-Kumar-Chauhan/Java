import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for Driving");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}