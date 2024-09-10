// Function overloading using datatypes...

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(1.0f, 2.0f));
    }

    // function for int sum
    public static int sum(int a,int b) {
        return a + b;
    }

    // function for float sum
    public static float sum (float a, float b) {
        return a + b;
    }
}