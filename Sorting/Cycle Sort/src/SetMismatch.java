// Q5 : Set Mismatch <Leetcode 645>

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int [] num = {1,2,2,4};
        int [] ans = findErrorNums(num);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int [] num){
        int i = 0;
        while (i<num.length) {
            int correctI = num[i] - 1;
            if (num[i] != num[correctI]) {
                swap(num, i, correctI);
            } else {
                i++;
            }
        }
        for (int index = 0; index < num.length; index++) {
            if (num[index] != index+1) {
                return new int [] {num[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
