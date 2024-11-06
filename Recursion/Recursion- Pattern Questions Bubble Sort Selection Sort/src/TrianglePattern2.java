// Q.2 Print triangle pattern...

public class TrianglePattern2 {
    public static void main(String[] args) {
        triangle2(5,0);
    }

    static void triangle2(int row , int col) {
        if (row == 0)
            return;

        if (col<row) {
            triangle2(row,col+1);
            System.out.print(" * ");
        } else {
            triangle2(row-1,0);
            System.out.println();
        }
    }
}
