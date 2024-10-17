public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,55,66,78};
        int target = 66;
        System.out.println(bsURecur(arr, target, 0, arr.length-1));
    }

    static int bsURecur(int [] arr, int target, int s, int e) {
        if (s>e) {
            return -1;
        }
        int m = s + (e - s)/2;

        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return bsURecur(arr,target,s, m-1);
        }
        return bsURecur(arr, target, m+1, e);

    }
}
