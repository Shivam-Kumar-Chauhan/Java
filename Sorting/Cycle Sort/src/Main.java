// Cyclic Sort Code...

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [] arr = {5,4,3,2,1};
       cycleSort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int [] arr){
        int cycleStart;
        cycleStart = 0;
        while(cycleStart< arr.length){
            int correctIndex = arr[cycleStart] - 1;
            if (arr[cycleStart] != arr[correctIndex]){
                swap(arr,cycleStart, correctIndex);
            } else {
                cycleStart++;
            }
        }
    }
    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}