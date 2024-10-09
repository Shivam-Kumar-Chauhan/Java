// Find Sum of Elements in Array

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int ar[] = { 1,2,4,5};

        int sum = 0;

//        for (int i = 0; i < ar.length; i++) {
//            sum = sum + ar[i];
//        }

        // Using For Each Loop
        for(int fact:ar) {
            sum = sum + fact;
        }
        System.out.println("Sum of Elements of Array is "+sum);
    }
}
