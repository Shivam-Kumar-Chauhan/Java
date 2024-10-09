// Check the Equality of 2 Arrays using equals method

import java.util.Arrays;

public class EqualityOf2ArraysUsingEqualsMethod {
    public static void main(String[] args) {
        int [] arr1 = {29,39,49,59,69};
        int [] arr2 = {29,39,49,59,69};

        boolean status = Arrays.equals(arr1,arr2);

        if(status == true) {
            System.out.println("Both Arrays are Equal");
        } else {
            System.out.println("Both Arrays are not Equal");
        }
    }
}
