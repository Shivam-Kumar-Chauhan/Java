// Search in Array using linear search

import java.util.Scanner;

public class SearchingInArrayUsingLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] a;
        a = new int[n];
        System.out.println("Give Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i <n ; i++) {
            if (target==a[i]){
                System.out.println("Element found at index: " +i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Element not found");
        }
    }
}
