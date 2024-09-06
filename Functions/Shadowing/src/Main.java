// Shadowing

public class Main {
    static int x = 17;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 71;
        System.out.println(x);
    }
}