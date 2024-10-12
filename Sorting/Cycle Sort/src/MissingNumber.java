// Q.1 Missing Number <Leetcode 268>

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {4, 0, 2, 1};
        System.out.println(missing(arr));
    }

    static int missing(int [] arr){
        int cycleStart = 0;
        while(cycleStart< arr.length) {
            int correctIndex = arr[cycleStart];
            if(arr[cycleStart] < arr.length && arr[cycleStart] != arr[correctIndex]) {
                swap(arr,cycleStart, correctIndex);
            } else {
                cycleStart++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
