public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(search(num, target, 1,4));
    }

    static int search(int[] num, int target, int start, int end){
        if(num.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = num[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
