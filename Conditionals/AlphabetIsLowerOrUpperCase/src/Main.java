import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Alphabet is in Lowercase");
        } else {
            System.out.println("Alphabet is in Uppercase");
        }
    }
}