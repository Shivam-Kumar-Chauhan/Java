// Print Even & Odd Numbers from an Array

public class CountEvenOddFromArrayUsingForEach {
    public static void main(String[] args) {
        int a[] = { 1, 2,3,4,5,6};

        System.out.println("Even Number of Given Array are below: ");
        for(int i : a) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd Number of Given Array are below: ");
        for(int i : a) {
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}