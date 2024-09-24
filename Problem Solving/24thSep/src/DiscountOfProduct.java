// In this program we get bill amount and discount from user and shows after discount amount using following formula
//Discount = bill - (bill * discount / 100)

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        float bill = sc.nextFloat();
        System.out.print("Enter Discount Percentage: ");
        float discount = sc.nextFloat();

        float afterDiscount = bill - (bill * discount / 100);

        System.out.print("After Discount Your Bill is " + afterDiscount);
    }
}
