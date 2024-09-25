//we have to calculate the CGPA percentage of five subjects( English, Hindi, Maths, Science and Social Study).
//CGPA ( Cumulative Grade Point Average ) is the systematic arrangement in the educational stream to get average of grade points. And the CGPA percentage is 9.5 times the CGPA.
//CGPA = (Grades in all Subjects) / (Total Number of Subjects).
//So, CGPA= 9.5 × CGPA

import java.util.Scanner;

public class CGPAPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("English: ");
        double E = sc.nextDouble();
        System.out.print("Hindi: ");
        double H = sc.nextDouble();
        System.out.print("Math: ");
        double M = sc.nextDouble();
        System.out.print("Science: ");
        double S = sc.nextDouble();
        System.out.print("SocialStudy: ");
        double ss = sc.nextDouble();

        double CGPA = (E + H + M + S + ss)/5;
        double cgpaPer = 9.5 * (CGPA);
        System.out.println("CGPA Percentage is " + cgpaPer);
    }
}