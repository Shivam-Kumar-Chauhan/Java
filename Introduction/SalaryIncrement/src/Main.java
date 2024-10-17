import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        int salary = sc.nextInt();

        // if-else

//        if(salary>10000){
//            salary = salary + 2000;
//        }
//        else {
//            salary = salary + 1000;
//        }

        // Nested if-else

        if(salary>10000){
            salary += 2000;
        } else if (salary>8000) {
            salary += 4500;
        } else {
            salary += 5000;
        }
        System.out.println(salary);
    }
}