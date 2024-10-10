// Sorting using bubble sort

import java.util.Arrays;
import java.util.Scanner;

public class SortingUsingBubbleSort {
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
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    static int bubbleSort(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return 1;
    }
}