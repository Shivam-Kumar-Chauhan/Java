// Find Missing Number in an Array

// This solution work under the conditions like
// 1. Array should be Sorted
// 2. Array should not have duplicate elements
// 3. Values should be in Range

public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,8,9};

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }

        int sum2 = 0;
        for (int i = 1; i <=9 ; i++) {
            sum2 = sum2 + i;
        }

        int missingNumber = sum2 - sum1;
        System.out.println("Missing Number in the Array is "+ missingNumber);
    }
}
