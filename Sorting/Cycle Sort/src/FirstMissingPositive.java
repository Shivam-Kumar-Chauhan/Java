// Q6 : First Missing Positive <Leetcode-41>

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int [] arr) {
        int i = 0;
        while(i< arr.length) {
            int correctI = arr[i] - 1;
            if(arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correctI]) {
                swap(arr, i, correctI);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int [] arr, int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
