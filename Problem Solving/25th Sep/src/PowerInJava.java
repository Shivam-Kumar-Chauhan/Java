//The pow() function takes place in java.lang.Math.pow () library.
//For example, to calculate the 5 to power 2, then it can be done as follows:
//Math.pow(5,2) =25
//Syntax:
//public static double pow(double a, double b)
//where,
//a is base
//b is exponent
// Mathe.pow(base, exponent)


import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base: ");
        double base = sc.nextDouble();
        System.out.println("Enter the Exponent: ");
        double exponent = sc.nextDouble();

        System.out.println("Power is " + Math.pow(base, exponent));
    }
}
