// Q.3 Bubble sort...

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        bubbleSort(arr, arr.length-1,0);
        System.out.println("Sorted Array is "+Arrays.toString(arr));
    }

    static void bubbleSort (int [] arr, int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            if (arr[col] > arr[col+1]) {
                //Swap
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, row,col+1);
        } else {
            bubbleSort(arr,row-1,0);
        }
    }
}
