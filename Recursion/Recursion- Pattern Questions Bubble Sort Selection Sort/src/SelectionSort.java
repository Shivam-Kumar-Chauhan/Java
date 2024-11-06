// Q.4 Selection sort...

import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
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
        selectionSort(arr, arr.length, 0,0);
        System.out.println("Sorted Array is "+ Arrays.toString(arr));
    }

    static void selectionSort(int[] arr,int row, int col, int max) {
        if (row == 0)
            return;
        if (col < row) {
            if (arr[col] > arr[max]) {
                selectionSort(arr,row,col+1,col);
            } else {
                selectionSort(arr,row,col+1,max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr,row-1,0,0);
        }
    }
}
