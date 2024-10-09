// Selection Sort

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] arr = {64, 25,12,22,11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr,0 ,last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int [] arr, int start, int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}