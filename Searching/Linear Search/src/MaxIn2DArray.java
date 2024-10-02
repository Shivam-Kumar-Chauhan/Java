public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 2, 32},
                {11, 5},
                {13, 8, 0, 6},
                {3, 1, 7, 4}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}