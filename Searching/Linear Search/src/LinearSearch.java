public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {23, 45, 12, 19, -3, 6};
        int target = -3;
        int ans = linearSearch(num,target);
        System.out.println(target + " Available at Index Number " + ans);
    }

    static int linearSearch (int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
