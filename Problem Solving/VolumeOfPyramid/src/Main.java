// Java Program for volume
// of Pyramid.
import java.util.*;
import java.lang.*;

class pyramid
{

    public static float volumeTriangular(int a,
                                         int b,
                                         int h)
    {
        float vol = (float)(0.1666) * a * b * h;
        return vol;
    }

    public static float volumeSquare(int b,
                                     int h)
    {
        float vol = (float)(0.33) * b * b * h;
        return vol;
    }

    public static float volumePentagonal(int a,
                                         int b,
                                         int h)
    {
        float vol = (float)(0.83) * a * b * h;
        return vol;
    }


    public static float volumeHexagonal(int a,
                                        int b,
                                        int h)
    {
        float vol = (float)a * b * h;
        return vol;
    }

    public static void main(String argc[])
    {
        Scanner sc = new Scanner(System.in);

        int b= sc.nextInt();
        int h= sc.nextInt();
        int a= sc.nextInt();
        System.out.println("Volume of triangular"+
                " base pyramid is: " +
                volumeTriangular(a, b, h));

        System.out.println("Volume of square base"+
                " pyramid is: " +
                volumeSquare(b, h));

        System.out.println("Volume of pentagonal"+" base pyramid is: " +
                volumePentagonal(a, b, h));

        System.out.println("Volume of Hexagonal"+" base pyramid is: " +
                volumeHexagonal(a, b, h));
    }
}