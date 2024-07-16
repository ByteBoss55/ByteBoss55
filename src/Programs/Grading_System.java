package Programs;

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score:");
        int number = sc.nextInt();
        char grade = calculateGrade(number);
        System.out.println("The grade is: " + grade);
        sc.close();
    }

    public static char calculateGrade(int score) {
        int roundedScore = score / 10;
        switch (roundedScore) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }
}
