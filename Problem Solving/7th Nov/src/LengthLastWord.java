// Q.2 Find the Length Of Last Word in a String...

import java.util.Scanner;

public class LengthLastWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        str = str.trim();

        int len = 0;

        for (int i = str.length()-1; i >= 0 ; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                len++;
            }
        }

        System.out.println("Length of last word in "+str+" is "+len);
    }
}
