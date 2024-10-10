// Sort Elements in Array Using Built-in Methods

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayUsingBuiltinMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are below: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sorted Array is ");
        // 1st In-Built Method-->
        Arrays.sort(arr);

        // 2nd In-Built Method-->
        // Arrays.parallelSort(arr);

        /* for sorting in descending order-->
        Integer [] arr = {65, 2 ,64 ,11,35 , 82};
        Arrays.sort(arr, Collections.reverseOrder());
        */
        System.out.println(Arrays.toString(arr));
    }
}