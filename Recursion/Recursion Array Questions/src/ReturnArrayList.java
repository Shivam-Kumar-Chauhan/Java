// Q. Return an ArrayList...( Linear Search )

import java.util.ArrayList;
import java.util.Scanner;
public class ReturnArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter target to be searched: ");
        int target = sc.nextInt();

        ArrayList<Integer> ans = findAllIndex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllIndex(int [] arr, int target, int index, ArrayList<Integer> list) {
        if (index==arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr,target, index+1, list);
    }
}