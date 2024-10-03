// Without using third variable...

public class Swap2 {
    public static void main(String[] args) {
        int a = 17, b = 71;

        System.out.println("Values before swapping: " +a+ " "+b);

        a = a + b;
        b = a-b;
        a = a-b;

        System.out.println("Values after swapping: " +a+" "+b);
    }
}
