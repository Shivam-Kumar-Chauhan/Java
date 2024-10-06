public class FloorOfNumber {
    public static void main(String[] args) {
        int [] a = {2, 3, 5, 9, 14, 16, 18};
        int key = 15;
        int ans = floor(a,key);
        System.out.println("Index of Floor is "+ans);
    }

    static int floor(int[] a, int key){
        int start = 0;
        int end = a.length - 1;

        while(start<=end) {
            int mid = start + ( end - start)/2;
            if(key<a[mid]){
                end = mid - 1;
            } else if (key>a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
