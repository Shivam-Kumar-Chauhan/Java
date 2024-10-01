public class SearchInString {
    public static void main(String[] args) {
        String name = "Shiv";
        char target = 'v';
        boolean ans = searchInStr(name, target);
        System.out.println(ans);
    }

    static boolean searchInStr(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
