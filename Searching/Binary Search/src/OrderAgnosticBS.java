import java.util.Scanner;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("The Elements of Array are: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
        }
        System.out.print("\nEnter the Element to be Searched: ");
        int key = sc.nextInt();
        int ans = orderAgnosticBs(arr, key);
        System.out.println(key+ " available at index number "+ans);
    }
    static int orderAgnosticBs(int [] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(isAsc){
                if(key<arr[mid]){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            } else {
                if(key>arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}