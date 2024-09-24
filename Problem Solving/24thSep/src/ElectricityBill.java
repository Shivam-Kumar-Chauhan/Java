import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Units: ");
        int units = sc.nextInt();
        System.out.println("Total Electricity Bill is " +  calculateEBill(units));
    }

    public static int calculateEBill(int units) {
        if (units <= 100) {
            return units * 10;
        } else if (units <= 200) {
            return (100 * 10)
                    + (units - 100)
                    * 15;
        } else if (units <= 300) {
            return (100 * 10)
                    + (100 * 15)
                    + (units - 200)
                    * 20;
        } else {
            return (100 * 10)
                    + (100 * 15)
                    + (100 * 20)
                    + (units - 300)
                    * 25;
        }
    }
}
