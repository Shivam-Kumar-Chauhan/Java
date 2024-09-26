public class EvenDaysOfAugust {
    public static void main(String[] args) {

        int eDays = 0;
        int daInAug = 31; // August has 31 days

        for (int day = 1; day <= daInAug; day++) {
            if (day % 2 == 0) {
                eDays++;
            }
        }
        System.out.println("Kunal can go out on " + eDays + " days in August.");
    }
}
