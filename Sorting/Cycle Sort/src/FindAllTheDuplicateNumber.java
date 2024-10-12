//Q.4 Find All Duplicates in an Array <Leetcode->442>

import java.util.ArrayList;
import java.util.List;

public class FindAllTheDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(allDuplicate(arr));
    }

    static List<Integer> allDuplicate(int [] arr) {
        int cycleStart = 0;
        while (cycleStart<arr.length) {
            int correctIndex = arr[cycleStart] - 1;
            if(arr[cycleStart] != arr[correctIndex]){
                swap(arr, cycleStart,correctIndex);
            } else {
                cycleStart++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
