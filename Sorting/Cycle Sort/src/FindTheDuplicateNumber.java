//  Q3 : Find the Duplicate Number <Leetcode 287>

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                int correctI = arr[i] -1;
                if (arr[i] != arr[correctI]) {
                    swap(arr, i, correctI);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}