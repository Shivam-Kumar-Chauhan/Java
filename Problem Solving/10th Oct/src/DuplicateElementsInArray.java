// Duplicate Elements in Array...
import java.util.Scanner;
public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int [] a;
        a = new int[n];
        System.out.println("Give Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        boolean find = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    System.out.println("Duplicate element= "+a[i]);
                    find = true;
                }
            }
        }
        if(find == false) {
            System.out.println("Array has no duplicate elements");
        }
    }
}
