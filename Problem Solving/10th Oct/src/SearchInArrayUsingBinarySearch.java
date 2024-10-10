// Searching in array using Binary Search
import java.util.Arrays;
import java.util.Scanner;
public class SearchInArrayUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] a;
        a = new int[n];
        System.out.println("Give Array Elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        System.out.println("Element found at index "+binarySearch(a,target));
        /*
        Binary Search Using Built-in Method...
        int ans = Arrays.binarySearch(a,target);
        System.out.println(ans);
         */
    }
    static int binarySearch(int [] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (a[mid] <target ){
                end = mid - 1;
            } else if (a[mid]>target){
                start = mid +1;
            } else {
                return mid ;
            }
        }
        return -1;
    }
}
