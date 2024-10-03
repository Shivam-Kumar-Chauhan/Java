// Using third variable...

public class Swap1 {
    public static void main(String[] args) {
        int a =10, b=20;
        System.out.println("Values before swapping: " +a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swapping: " +a+" "+b);
    }
}
