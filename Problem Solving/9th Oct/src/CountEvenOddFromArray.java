// Print Even & Odd Numbers from an Array

public class CountEvenOddFromArray {
    public static void main(String[] args) {
        int ar[] = { 1, 2,3,4,5,6};

        System.out.println("Even Numbers of Array are");
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]%2==0){
                System.out.println(ar[i]);
            }
        }
        System.out.println("Odd Numbers of Array are");
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]%2!=0){
                System.out.println(ar[i]);
            }
        }
    }
}