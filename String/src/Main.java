// Day-36
// String in Java

public class Main {
    public static void main(String[] args) {

        /*
        // String example-

        String name = "Shiv";
        String name2 = "Shivansh";
        String c = "Shivam";
        System.out.println(name+ " "+name2+ " "+ c);
        */

        /*
        // String Pool

        String name = "Shiva";
        String name2 = "Shiva";
        */

        /*
        // Comparison of Strings

        //1. Through ==
        String n1 = "Shiv";
        String n2 = "Shiv";
        System.out.println(n1 == n2);

        // String with same value but different object
        String a = new String("Shiv");
        String b = new String("Shiv");
        System.out.println(a == b);
        */

        //2. .equals method
        String a = "shiv";
        String b = "shiv";
        String c = "Shiv";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c)); // because case is not same

    }
}