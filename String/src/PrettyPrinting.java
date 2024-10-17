// Pretty Printng (CP)

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 432.1234f;
        System.out.printf("Formated number is %.2f", a);

        float b = 432.1274f;
        System.out.printf("%nFormated number is %.2f" , b);

        System.out.printf("%nPie= %.2f" , Math.PI);

        String s = "Shiv";
        System.out.printf("%n%s", s);
        
    }
}

/*
//There are many format specifiers we can use. Here are some common ones:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline

*/