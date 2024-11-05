// Q. Searching in array using Linear Search...

import java.util.ArrayList;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
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

        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target, 0));
        System.out.println(findIndexLast(arr,target,arr.length-1));
        findAllIndex(arr,target,0);
        System.out.println(list);
    }

    // Below method will only return true or false for if target element is in array or not
    static boolean find(int [] arr, int target, int index) {
        //base condition
        if(index== arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // Below method will return index value of target element if target element is in array
    static int findIndex(int [] arr, int target, int index) {
        if(index==arr.length)
            return -1;
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr,target,index+1);
        }
    }

    // Below method will return index value of target element from last if target element is in array
    static int findIndexLast(int [] arr, int target, int index) {
        if(index==-1)
            return -1;
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr,target,index-1);
        }
    }

    // Below method will return a list of index value of target element if target element is in array
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index== arr.length) {
            return;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
}