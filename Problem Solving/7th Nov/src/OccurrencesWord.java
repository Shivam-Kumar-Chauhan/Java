// Q.1 Count the number of occurrences of a word in a string...

import java.util.Scanner;
public class OccurrencesWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to be searched: ");
        String word = sc.nextLine();

        int count = 0;

        String temp[] = sentence.split(" ");

        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i])) {
                count++;
            }
        }

        System.out.println("Number of occurances = "+count);
    }
}