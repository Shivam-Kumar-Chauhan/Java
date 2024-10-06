public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = { -3, -1 , 2, 5, 7, 9, 11, 17};
        int key = 17;
        int ans = binarySearch(arr, key);
        System.out.println(ans);
    }

    static int binarySearch (int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(key<arr[mid]){
                end = mid-1;
            } else if(key>arr[mid]){
                start = mid  + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
